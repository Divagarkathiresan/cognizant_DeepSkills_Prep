import React from 'react';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';
import OfficeSpace from './components/OfficeSpace';

function App() {
  const flag = true;

  return (
    // <div className="App" style={{ padding: '20px', fontFamily: 'Arial' }}>
    //   {flag ? <ListofPlayers /> : <IndianPlayers />}
    //   <hr />
    //   <IndianPlayers />
    // </div>
    <OfficeSpace />
  );
}

export default App;
