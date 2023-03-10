import React from 'react'
import Header from '../../Components/Header'

const AboutUsScreen = (props) => {
  return (
    <div className="Screen">
      <Header title="About Us"/>
      <div className="info">
        <div className="row">
          <div className="col-md-6 col-sm-12 col-xs-12" Style="padding : 25px">
            <h5 className="text-center">Vision</h5>
            <p>
            "With your continued support and art patronage we hope to make available handpicked Indian talent from across the country exclusively for you.
      With a fresh rebranded look, our gallery's vision is to encourage young Indian artists as well as to ensure that you as a collector get the best of Indian Art to enjoy in your personal
            </p>
          </div>
          <div className="col-md-6 col-sm-12 col-xs-12" Style="padding : 25px">
            <h5 className="text-center">Mission</h5>
            <p> Showcase paintings and sculptures of young Indian artist's.
                 Introduce clients to the best of Indian art.</p>
          </div>
          {/* <div className="col-md-6 col-sm-12 col-xs-12" Style="padding : 25px"> */}
            {/* <h5 className="text-center">Serving At</h5>
            <ul>
            <table Style="width: 100%">
                <tr>
                  <td><li></li></td>
                  <td>Akurdi</td>
                  <td>Near Akurdi railway station </td>
                  <td className="text-center"> 10:00 to 19:00 Hrs</td>
                </tr>

                <tr>
                  <td><li></li></td>
                  <td>Pimpri</td>
                  <td>Ajmera colony </td>
                  <td className="text-center"> 09:00 to 23:00 Hrs</td>
                </tr>

                <tr>
                  <td><li></li></td>
                  <td>Pune</td>
                  <td>Gokhale chowk, Magarpatta </td>
                  <td className="text-center"> 09:00 to 22:00 Hrs</td>
                </tr>
              </table>
            </ul>
          </div> */}
          <div className="col-md-6 col-sm-12 col-xs-12" Style="padding : 25px">
            <h5 className="text-center">Values</h5>
            <ul>
              <li>To listen to the customers demands, to provide real products information</li>
              <li>To be responsible through commitment, and respect.</li>
            </ul>
          </div>
          <hr/>
          {/* <div className="col-md-12 col-sm-12 col-xs-12" Style="padding : 25px">
            <h5 className="text-center">Ease of Shopping</h5>
            <p>
            We’ve taken away all the stress associated with shopping for daily essentials, and you can now order all your groceries online without travelling long distances or standing in serpentine queues. <br/>
            Add to this the convenience of finding all your requirements at one single source, along with great savings, and you will realize that Grocers- a online supermarket, will revolutionize the way India shops for groceries. <br/>
            Online grocery shopping has never been easier. Need things fresh? Whether it’s fruits and vegetables or dairy and meat, we have this covered as well! Get fresh fruits, vegetables, sdiary products and more online at your convenience.
            </p>
          </div> */}

        </div>
      </div>
    </div>
  )
}

export default AboutUsScreen
