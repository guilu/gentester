import React, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';
import BloqueList from "./components/bloqueList";

const App = () => {
    console.log("empezzzamos!")
}

ReactDOM.render(
    <BloqueList/>,
    document.getElementById('react')
)
