#1. Create a list of 10 ticker symbols of your choice!
#2. Print out the name, website, and current price of all companies using a loop!

#3. Take in input of a ticker symbol that the user wants to look up.
#4. Print out the name, website, and current price of that company!

import yfinance as yf

stock = yf.Ticker("GOOGL")
current_price = stock.history(period="1d")["Close"][0]
info = stock.info

print(info["longName"])
print(info["website"])
print("GOOGL Current Price:", current_price)
Ticker = ["AAPL","AMZN","BRK.A","GOOGL","MSFT","TSLA","WMT","NVDA","META","JPM"]