import React from 'react';
import { Carousel,Image} from "react-bootstrap";
import img1 from "../../assets/img/img1.jpg";
import Produtos from "../../Components/Produtos"

export default function Header() {

    return (

        <>

        <Carousel style={{ height: "550px"}}>
            <Carousel.Item  style={{ height: "550px"}}>
            <Image src={img1} alt="Logo" style={{ objectFit: "cover" }}  alt="Third slide"  className="d-block w-100"/>
                <Carousel.Caption>
                    <h3>First slide label</h3>
                    <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
                </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item style={{ height: "550px"}}>
            <Image src={img1} alt="Logo"  alt="Third slide"  className="d-block w-100" />

                <Carousel.Caption>
                    <h3>Second slide label</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item style={{ height: "550px"}}>
            <Image src={img1} style={{ objectFit: "cover" }} alt="Logo"  alt="Third slide"  className="d-block w-100" />

                <Carousel.Caption>
                    <h3>Third slide label</h3>
                    <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p>
                </Carousel.Caption>
            </Carousel.Item>
        </Carousel>

        <Produtos/>

        </>

    );
}