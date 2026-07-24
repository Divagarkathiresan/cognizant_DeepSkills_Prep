import React from 'react';

export default function User({ onLogout }) {
  return (
    <div>
      <h1>This is user page</h1>
      <button onClick={onLogout}>Logout</button>
    </div>
  );
}