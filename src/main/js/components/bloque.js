import React from "react";

const Bloque = ({texto}) => {
    return <li key={texto} className="list-group-item">{texto}</li>;
}
export default Bloque;