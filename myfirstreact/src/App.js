import React from 'react';
import Home from './components/Home';
import About from './components/About';
import Contact from './components/Contact';
import CalculatorApp from './components/calculatorApp';
function App() {
  return (
    <div className="App">
      {/* <Home />
      <About />
      <Contact /> */}
      <CalculatorApp name="Divagar" school="Cognizant" total="100" goal="200"/>
    </div>
  );
}

export default App;
