import React, { useState } from 'react';

export default function CurrencyConvertor() {
  const [rupees, setRupees] = useState('');
  const [euro, setEuro] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const amount = parseFloat(rupees);

    if (!isNaN(amount)) {
      const converted = (amount / 90).toFixed(2);
      setEuro(converted);
    } else {
      setEuro('');
    }
  };

  return (
    <div style={{ marginTop: '20px' }}>
      <h2>Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
        <label>
          Indian Rupees:
          <input
            type="number"
            value={rupees}
            onChange={(e) => setRupees(e.target.value)}
            style={{ marginLeft: '10px' }}
          />
        </label>
        <button type="submit" style={{ marginLeft: '10px' }}>
          Convert
        </button>
      </form>
      {euro && <p>Amount in Euro: {euro} EUR</p>}
    </div>
  );
}
