import React from 'react';
import styles from './CohortDetails.module.css';

export default function calculatorApp({ name, school, total, goal, status = 'ongoing' }) {
    const percentToDecimal = (decimal) => {
        return (decimal.toFixed(2) + "%");
    };

    const calculatePercentage = (total, goal) => {
        return percentToDecimal((total / goal) * 100);
    };

    const headingColor = status === 'ongoing' ? 'green' : 'blue';

    return (
        <div className={styles.box}>
            <h3 style={{ color: headingColor }}>Cohort Details</h3>
            <dl>
                <dt>Name</dt>
                <dd>{name}</dd>
                <dt>School</dt>
                <dd>{school}</dd>
                <dt>Total</dt>
                <dd>{total} Marks</dd>
                <dt>Score</dt>
                <dd>{calculatePercentage(total, goal)}</dd>
                <dt>Status</dt>
                <dd>{status}</dd>
            </dl>
        </div>
    );
}