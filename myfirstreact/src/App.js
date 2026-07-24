import React from 'react';
import OfficeSpace from './components/OfficeSpace';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  const handleWelcome = (message) => {
    alert(message);
  };

  const handleClick = (event) => {
    event.preventDefault();
    alert('I was clicked');
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <button onClick={() => handleWelcome('welcome')}>Say Welcome</button>
      <br /><br />
      <button onClick={handleClick}>Click Me</button>

      <OfficeSpace />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
