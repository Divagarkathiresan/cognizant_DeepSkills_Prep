import React from 'react';

export default function Guest({ onLogin }) {
  return (
    <div>
      <h1>This is guest page</h1>
      <button onClick={onLogin}>Login</button>
    </div>
  );
}