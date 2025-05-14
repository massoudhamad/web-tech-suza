document.addEventListener('DOMContentLoaded', function() {
    document.querySelector('form').onsubmit = function() {
        fetch('https://api.exchangerate-api.com/v4/latest/USD')
        .then(response => response.json())
        .then(data=>{
            console.log(data);
            const currency = document.querySelector('#currency').value.toUpperCase();
            console.log(currency);
            const rate = data.rates;
            console.log(rate[currency]);

            if(rate != undefined){
                document.querySelector('#result').innerHTML = `1 USD is equal to ${rate[currency]}${currency}.`;
            }
            else 
            {
                document.querySelector('#result').innerHTML = `Invalid Currency Code.`;
            }
        })
        .catch(error =>{
            console.log('Error:', error);
        });
        return false; // Prevent form submission
        }
        });