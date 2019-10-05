import React from 'react';
import './App.css';
import PrimeNumbers from "./PrimeNumbers";
import { BrowserRouter as Router, Route } from 'react-router-dom';

function App() {
  return (
      <Router>
        <div className="App">
          <div>
            <Route exact path="/" component={PrimeNumbers} />
          </div>
        </div>
      </Router>
  );
}

export default App;
