import React from 'react';
export default function calculatorApp({name,school,total,goal}){

    const percentToDecimal = (decimal) =>{
        return (decimal.toFixed(2)+ "%");
    }

    const calculatePercentage = (total,goal) =>{
        return percentToDecimal((total/goal)*100);
    }
    return(
        <div>
            <h1>Name : {name}</h1>
            <p>School : {school}</p>
            <p>Total : {total} Marks</p>
            <p>Score : {calculatePercentage(total, goal)}</p>
        </div>
    )
}