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
        const promise = await axios.get('/api/data-management/prime-numbers-data');
        this.setState({
            primeNumbersData: promise.data.primeNumberInfos
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
        const promise = await axios.get(`/api/prime-numbers/is-prime-number?number=${this.state.numberToCheck}`);
        this.setState({
            isPrimeNumber: promise.data.isPrimeNumber,
            timeSpentInMillis: promise.data.timeSpentInMillis
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