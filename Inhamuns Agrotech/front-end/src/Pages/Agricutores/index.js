import React from "react";
import { Container, Navbar,Form,Button,Table} from "react-bootstrap";

import "./style.css";

export default function Agricutores(){

    return(
      
    <Container fluid="sm" className="MainContainer"> 

            <Navbar className="Navigation">
                <Navbar.Brand> <h4> Agricutores </h4></Navbar.Brand>
            </Navbar>

            <Table responsive hover className="TableActivities">
                <thead>
                    <tr style={{ background: 'white'}} >
                    
                    <th>Nome </th>
                    <th>Endereço </th>
                    <th>Telefone </th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                  
                    <td>..</td>
                    <td>..</td>
                    <td>..</td>
                    </tr>
                </tbody>
            </Table>

    </Container>
    )
}

