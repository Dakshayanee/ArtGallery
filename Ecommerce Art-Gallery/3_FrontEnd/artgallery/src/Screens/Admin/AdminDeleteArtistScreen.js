/* eslint-disable react-hooks/exhaustive-deps */
import axios from 'axios'
import React, { useEffect, useState } from 'react'
import Header from '../../Components/Header'
import {toast} from "react-toastify"
import { URL_PATH } from '../../Constants/Url'

const AdminDeleteArtistScreen = (props) => {
    
    const url_artist = URL_PATH+"/user/artist"
    const url_delivery = URL_PATH+"/user/delivery_persons"
    const url_delete = URL_PATH+"/user/delete"
    const header = {
        headers: {
          "Content-Type": "application/json",
          "Authorization" : sessionStorage.getItem("Authorization")
        },
      };

    const [artistList,setArtistList] = useState([])
    const [deliveryList,setDeliveryList] = useState([])
    let [isDeleted,setIsDeleted] = useState(false)
    
    useEffect(()=>{
        setIsDeleted(false)
        axios.get(url_artist,header)
        .then((response)=>{
            setArtistList(response.data.data)
        })
        .catch((error)=>{
            toast.error(error.message,{autoClose:2000,position:toast.POSITION.TOP_RIGHT})
        })
    
        axios.get(url_delivery,header)
        .then((response)=>{
            setDeliveryList(response.data.data)
        })
        .catch((error)=>{
            toast.error(error.message,{autoClose:2000,position:toast.POSITION.TOP_RIGHT})
        })
    
    },[isDeleted])

    const deleteArtist = (id) => {
        axios.delete(url_delete+`/${id}`,header)
        .then((response)=>{
            toast.success(response.data.data,{autoClose:2000,position:toast.POSITION.TOP_RIGHT})
            setIsDeleted(true)
        })
        .catch((error)=>{
            toast.error(error.message,{autoClose:2000,position:toast.POSITION.TOP_RIGHT})
        })
    }

    return (
        <div className="Screen">
            <Header title="All artist"/>
            <br/>
            <div className="row">
                <div className="col-md-6 Block">
                    <h6 className="text-center">View artists</h6>
                    <hr/>
                    <br/>
                    <table className="table table-striped table-hover">
                        <tbody>
                            {
                                artistList && 
                                artistList.map( artist=>{
                                    return (
                                        <tr>
                                            <td className="text-left"> {artist.id} </td>
                                            <td className="text-left"> {artist.firstName} </td>
                                            <td className="text-left"> {artist.email} </td>
                                            <td className="text-left"> {artist.phone || "Not Provided"} </td>
                                            <td className="text-left"><button className="btn btn-outline-danger" onClick={()=>deleteArtist(artist.id)}>Delete</button></td>
                                        </tr>    
                                        )
                                    })
                            }
                        </tbody>
                    </table>
                </div>
                
                <div className="col-md-6">
                    <h6 className="text-center">View Deliverers</h6>
                    <hr/>
                    <br/>
                    <table className="table table-striped table-hover">
                        <tbody>
                            {
                                deliveryList && 
                                deliveryList.map( delivery=>{
                                    return (
                                        <tr>
                                            <td className="text-left"> {delivery.id} </td>
                                            <td className="text-left"> {delivery.firstName} </td>
                                            <td className="text-left"> {delivery.email} </td>
                                            <td className="text-left"> {delivery.phone || "Not Provided"} </td>
                                            <td className="text-left"><button className="btn btn-outline-danger" onClick={()=>deleteArtist(delivery.id)}>Delete</button></td>
                                        </tr>    
                                        )
                                    })
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    )
}

export default AdminDeleteArtistScreen
