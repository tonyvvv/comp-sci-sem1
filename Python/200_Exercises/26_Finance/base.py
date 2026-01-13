#Run "pip install yfinance" in a terminal

import yfinance as yf

stock = yf.Ticker("GOOGL")
current_price = stock.history(period="1d")["Close"][0]
info = stock.info

print(info["longName"])
print(info["website"])
print("GOOGL Current Price:", current_price)