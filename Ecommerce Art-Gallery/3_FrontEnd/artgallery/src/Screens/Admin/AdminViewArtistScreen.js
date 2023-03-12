/* eslint-disable react-hooks/exhaustive-deps */
import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useSelector } from 'react-redux'
import Header from '../../Components/Header'
import { toast } from "react-toastify"
import { URL_PATH } from '../../Constants/Url'

const AdminViewArtistScreen = (props) => {

    const userSignIn = useSelector(store => store.userSignIn)
    const url_artist= URL_PATH + "/user/artists"
    const url_delivery = URL_PATH + "/user/delivery_persons"

    const header = {
        headers: {
            "Content-Type": "application/json",
            "Authorization": sessionStorage.getItem("Authorization")
        },
    };

    const [artistList, setArtistList] = useState([])
    const [deliveryList, setDeliveryList] = useState([])

    useEffect(() => {
        axios.get(url_artist, header)
            .then((response) => {
                setArtistList(response.data.data)
            })
            .catch((error) => {
                toast.error(error.message, { autoClose: 2000, position: toast.POSITION.TOP_RIGHT })
            })

        axios.get(url_delivery, header)
            .then((response) => {
                setDeliveryList(response.data.data)
            })
            .catch((error) => {
                toast.error(error.message, { autoClose: 2000, position: toast.POSITION.TOP_RIGHT })
            })
    }, [])

    return (
        <div className="Screen">
            {
                !userSignIn.response &&
                <Header title="You are not logged in" />
            }
            {
                userSignIn.response &&
                <div>
                    <Header title="All artists" />
                    <br />
                    <div className="row">
                        <div className="col-md-6 Block">
                            <h6 className="text-center">View Artists</h6>
                            <hr />
                            <br />
                            <table className="table table-striped table-hover">
                                <thead>
                                    <tr>
                                        {/* <td className="text-left"> {artist.id} </td> */}
                                        <td className="text-left"> Name </td>
                                        <td className="text-left">email </td>
                                        <td className="text-left">phone</td>
                                    </tr>

                                </thead>
                                <tbody>
                                    {
                                        artistList && artistList.map(artist => {
                                            return (
                                                <tr>
                                                    {/* <td className="text-left"> {artist.id} </td> */}
                                                    <td className="text-left"> {artist.firstName} </td>
                                                    <td className="text-left"> {artist.email} </td>
                                                    <td className="text-left"> {artist.phone || "Not Provided"} </td>
                                                </tr>
                                            )
                                        })
                                    }
                                </tbody>
                            </table>
                        </div>
                        <div className="col-md-6">
                            <h6 className="text-center">View Deliverers</h6>
                            <hr />
                            <br />
                            <table className="table table-striped table-hover">
                            <thead>
                                    <tr>
                                        {/* <td className="text-left"> {artist.id} </td> */}
                                        <td className="text-left"> Name </td>
                                        <td className="text-left">email </td>
                                        <td className="text-left">phone</td>
                                    </tr>

                                </thead>
                                <tbody>
                                    
                                    {
                                        deliveryList && deliveryList.map(delivery => {
                                            return (
                                                <tr>
                                                    {/* <td className="text-left"> {delivery.id} </td> */}
                                                    <td className="text-left"> {delivery.firstName} </td>
                                                    <td className="text-left"> {delivery.email} </td>
                                                    <td className="text-left"> {delivery.phone || "Not Provided"} </td>
                                                </tr>
                                            )
                                        })
                                    }
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            }
        </div>
    )
}

export default AdminViewArtistScreen
