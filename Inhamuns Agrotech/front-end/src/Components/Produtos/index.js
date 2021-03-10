import React from 'react';
import { Container, Card, CardDeck } from "react-bootstrap";

import "./styles.css";

export default function Header() {

    return (

        <Container fluid="sm" className="MainContainer">

            <CardDeck className="justify-content-between">

                <Card style={{ width: '11rem',height:'11rem' }} className="produto1">
                    <Card.Body>
                        
                    </Card.Body>
                </Card>

                <Card style={{ width: '11rem', height:'11rem'}} className="produto2">
                    <Card.Body>
                        
                    </Card.Body>
                </Card>


                <Card style={{ width: '11rem',height:'11rem' }} className="produto3">
                    <Card.Body>
                       
                    </Card.Body>
                </Card>

                <Card style={{ width: '11rem',height:'11rem' }} className="produto4">
                    <Card.Body>
                       
                    </Card.Body>
                </Card>


            </CardDeck>

        </Container>

    );
}