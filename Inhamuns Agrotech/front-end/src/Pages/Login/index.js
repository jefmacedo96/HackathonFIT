import React, { useState } from "react"
import { Link} from 'react-router-dom';
import { Container, Form, Col, Row, Button, Navbar } from "react-bootstrap"
import "./style.css";

export default function login() {

 
  return (

    <Container fluid="sm" className=" BoxContainer">

      <Navbar className="Navigation justify-content-center">
        <Navbar.Brand > <h4> Login </h4></Navbar.Brand>
      </Navbar>

      <Form className="justify-content-center">
        <Row className="justify-content-center">

          <Col sm={4}>
            <Form.Row>
              <Form.Group as={Col} controlId="curricularStructure">
                <Form.Label>Email</Form.Label>
                <Form.Control type="text"  />
              </Form.Group>
            </Form.Row>
          </Col>

        </Row>

        <Row className="justify-content-center">
          <Col sm={4}>
            <Form.Row>
              <Form.Group as={Col} controlId="CategoryV">
                <Form.Label>Senha</Form.Label>
                <Form.Control type="password"  />
              </Form.Group>
            </Form.Row>
          </Col>
        </Row>


        <Navbar className="NavigationRegister">

          <Navbar.Collapse className="justify-content-center">
            <div>
              <Link to="/"> <Button className="button" variant="secondary" > Cancelar </Button></Link>
              <Button className="button"  style={{ marginLeft: '10px' }}> Entrar </Button>
            </div>
          </Navbar.Collapse>
        </Navbar>
      </Form>
    </Container>
  )
}

