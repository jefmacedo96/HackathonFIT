import React from 'react';
import { Container, Card, CardDeck, Image } from "react-bootstrap";
import porco from "../../assets/img/porco.png";
import agricultura from "../../assets/img/agricultura.svg";
import legumes from "../../assets/img/legumes.svg";
import fruta from "../../assets/img/fruta.svg";

import "./styles.css";

export default function Header() {

    return (

        <Container fluid="sm" className="MainContainer">

            <CardDeck className="justify-content-between">

                <Card style={{ width: '11rem',height:'11rem' }} className="produto1">
                    <Card.Body>
                    <Image src={fruta} style={{ objectFit: "cover", width: "100px", height: "100px", margin: 15 }} />
                    </Card.Body>
                </Card>

                <Card style={{ width: '11rem', height:'11rem'}} className="produto2">
                    <Card.Body>
                    <Image src={legumes} style={{ objectFit: "cover", width: "100px", height: "100px", margin: 15}} />    
                    </Card.Body>
                </Card>


                <Card style={{ width: '11rem',height:'11rem' }} className="produto3">
                    <Card.Body>
                    <Image src={agricultura} style={{ objectFit: "cover", width: "80px", height: "80px", margin: 25}} />   
                    </Card.Body>
                </Card>

                <Card style={{ width: '11rem',height:'11rem' }} className="produto4">
                    <Card.Body>
                    <Image src={porco} style={{ objectFit: "cover", width: "80px", height: "80px", margin: 25}} />   
                    </Card.Body>
                </Card>


            </CardDeck>

        </Container>

    );
}