import React, { Component } from 'react';
import axios from 'axios';

class PrimeNumbers extends Component {
    state = {
        numberToCheck: "",
        isPrimeNumber: null,
        timeSpentInMillis: null,
        primeNumbersData: []
    };

    componentDidMount() {
        this.fetchPrimes();
    }

    async fetchPrimes() {
        //const values = await axios.get('http://localhost:8071/api/v1/data-management/prime-numbers-data');
        const values = {
            primeNumberInfos: [
                {
                    primeNumber: 5,
                    timeSpentInMillis: 30
                },
                {
                    primeNumber: 5,
                    timeSpentInMillis: 30
                }
            ]
        };
        this.setState({
            primeNumbersData: values.primeNumberInfos
        });
    }

    renderPrimesData() {
        const entries = this.state.primeNumbersData.map(dto =>
            <div>
                {dto.primeNumber} : {dto.timeSpentInMillis} ms
            </div>
        );
        return entries;
    }

    renderPrimeNumberCheckResult() {
        if (this.state.isPrimeNumber != null) {
            const result =
                <div>
                    <h3>Prime number check result:</h3>
                    Is prime: {this.state.isPrimeNumber.toString()}, Time spent: {this.state.timeSpentInMillis} ms
                </div>;
            return result;
        }
    }

    handleSubmit = async (event) => {
        event.preventDefault();
        //const result = await axios.get('http://localhost:8070/api/v1/prime-numbers/is-prime-number?number=' + this.state.numberToCheck);
        const result = {
            isPrimeNumber: true,
            timeSpentInMillis: 500
        };
        this.setState({
            isPrimeNumber: result.isPrimeNumber,
            timeSpentInMillis: result.timeSpentInMillis
        });
    };

    render() {
        return (
            <div>
                <form onSubmit={this.handleSubmit}>
                    <label>Enter number to check: </label>
                    <input
                        value={this.state.numberToCheck}
                        onChange={event => this.setState({numberToCheck: event.target.value })}
                    />
                    <button>Submit</button>
                </form>

                <div>
                    {this.renderPrimeNumberCheckResult()}
                </div>

                <h3>Prime numbers data:</h3>
                {this.renderPrimesData()}
            </div>
        );
    }
}

export default PrimeNumbers;