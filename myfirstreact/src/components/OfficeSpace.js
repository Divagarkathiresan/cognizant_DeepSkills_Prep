import React from 'react';

export default function OfficeSpace() {
  const itemName = { Name: 'Office Space', Price: 1000, Location: 'Bangalore' };
  const isLowPrice = itemName.Price < 60000;

  return (
    <div>
      <h1>name : {itemName.Name}</h1>
      <p style={{ color: isLowPrice ? 'red' : 'black' }}>Price: {itemName.Price}</p>
      <p>Location: {itemName.Location}</p>
    </div>
  );
}