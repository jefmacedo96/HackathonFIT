import React from 'react';
import { Carousel,Image} from "react-bootstrap";
import img1 from "../../assets/img/img1.jpg";
import img2 from "../../assets/img/img2.jpg";
import img3 from "../../assets/img/img3.jpg";
import img4 from "../../assets/img/img4.jpg";
import Produtos from "../../Components/Produtos"

export default function Header() {

    return (

        <>

        <Carousel style={{ height: "550px"}}>
            <Carousel.Item  style={{ height: "550px"}}>
            <Image src={img1} style={{ objectFit: "cover" }}  alt="Third slide"  className="d-block w-100"/>
                <Carousel.Caption>
                    <h3>Inhamuns Agrotech</h3>
                    <p>aproximando o pequeno agricultor do mercado</p>
                </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item style={{ height: "550px"}}>
            <Image src={img2} alt="Third slide"  className="d-block w-100" />

                <Carousel.Caption>
                    <h3>Inhamuns Agrotech</h3>
                    <p>aproximando o pequeno agricultor do mercado</p>
                </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item style={{ height: "550px"}}>
            <Image src={img3} style={{ objectFit: "cover" }} alt="Third slide"  className="d-block w-100" />

                <Carousel.Caption>
                    <h3>Inhamuns Agrotech</h3>
                    <p>aproximando o pequeno agricultor do mercado</p>
                </Carousel.Caption>
            </Carousel.Item>
            <Carousel.Item style={{ height: "550px"}}>
            <Image src={img4} style={{ objectFit: "cover" }} alt="Third slide"  className="d-block w-100" />

                <Carousel.Caption>
                    <h3>Inhamuns Agrotech</h3>
                    <p>aproximando o pequeno agricultor do mercado</p>
                </Carousel.Caption>
            </Carousel.Item>
        </Carousel>

        <Produtos/>

        </>

    );
}