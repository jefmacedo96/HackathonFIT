import React, { useState } from "react"
import { Link} from 'react-router-dom';
import { Container, Form, Col, Row, Button, Navbar } from "react-bootstrap"
import "./style.css";

export default function cadastrarUsuario() {

 
  return (

    <Container fluid="sm" className=" BoxContainer">

      <Navbar className="Navigation">
        <Navbar.Brand > <h4> Cadastrar Usuário </h4></Navbar.Brand>
      </Navbar>

      <Form >
        <Row>

          <Col sm={4}>
            <Form.Row>
              <Form.Group as={Col} controlId="curricularStructure">
                <Form.Label>Email</Form.Label>
                <Form.Control type="text"  />
              </Form.Group>
            </Form.Row>
          </Col>

          <Col sm={4}>
            <Form.Row>
              <Form.Group as={Col} controlId="CategoryI">
                <Form.Label>Nome completo</Form.Label>
                <Form.Control type="number" />
              </Form.Group>
            </Form.Row>
          </Col>

          <Col sm={4}>
            <Form.Row>
              <Form.Group as={Col} controlId="CategoryII">
                <Form.Label>Número de registro rural</Form.Label>
                <Form.Control type="number" />
              </Form.Group>
            </Form.Row>
          </Col>
        </Row>

        <Row>
          <Col sm={4}>
            <Form.Row>
              <Form.Group as={Col} controlId="CategoryIII">
                <Form.Label>Telefone</Form.Label>
                <Form.Control type="number" />
              </Form.Group>
            </Form.Row>
          </Col>

          <Col sm={4}>
            <Form.Row>
              <Form.Group as={Col} controlId="CategoryIV">
                <Form.Label>Endereço</Form.Label>
                <Form.Control type="number" />
              </Form.Group>
            </Form.Row>
          </Col>

          <Col sm={4}>
            <Form.Row>
              <Form.Group as={Col} controlId="CategoryV">
                <Form.Label>Senha</Form.Label>
                <Form.Control type="number"  />
              </Form.Group>
            </Form.Row>
          </Col>
        </Row>


        <Navbar className="NavigationRegister">

          <Navbar.Collapse className="justify-content-end">
            <div>
              <Link to="/"> <Button className="button" variant="secondary" > Voltar </Button></Link>
              <Button className="button"  style={{ marginLeft: '10px' }}> Cadastrar </Button>
            </div>
          </Navbar.Collapse>
        </Navbar>
      </Form>
    </Container>
  )
}

