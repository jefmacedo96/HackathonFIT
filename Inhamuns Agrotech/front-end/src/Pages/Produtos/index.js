import React from "react";
import { Container, Navbar,Form,Button,Table} from "react-bootstrap";

import "./style.css";

export default function Produtos(){

    return(
      
    <Container fluid="sm" className="MainContainer"> 

            <Navbar className="Navigation">
                <Navbar.Brand> <h4> Produtos </h4></Navbar.Brand>
            </Navbar>

            <Table responsive hover className="TableActivities">
                <thead>
                    <tr style={{ background: 'white'}} >
                    
                    <th>Descrição </th>
                    <th>Preço </th>
                    <th>Fornecedor </th>
                    <th/>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                  
                    <td>..</td>
                    <td>..</td>
                    <td>..</td>
                    
                    <td className="GroupButton">
                    <Button variant="danger" size="sm" > Ver Fornecedor </Button>
                    </td>

                    </tr>
                </tbody>
            </Table>

    </Container>
    )
}

