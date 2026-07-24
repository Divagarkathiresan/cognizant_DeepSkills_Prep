import React from 'react';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';

function App() {
  const flag = true;

  return (
    <div className="App" style={{ padding: '20px', fontFamily: 'Arial' }}>
      {flag ? <ListofPlayers /> : <IndianPlayers />}
      <hr />
      <IndianPlayers />
    </div>
  );
}

export default App;
