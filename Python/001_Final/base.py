# Type "pip install sklearn" into the terminal
import json
import random
import joblib
from datetime import datetime
import requests
name = "MangaGPT"

model = joblib.load("./Buffet_Poole26/Python/001_Final/intents.pkl")

with open("./Buffet_Poole26/Python/001_Final/intents.json") as file:
    intents = json.load(file)["intents"]
    
def get_response(tags):
    i = []
    for intent in intents:
        if intent["tags"] == tags:
            i = intent
            break
    response = random.choice(i["responses"])
    return response
    
print("Welcome to MangaGPT, the manga bot")

while True:
    userInput = input("you: ")
    
    if userInput.lower() == "exit":
        print("bye")
        break
    
    predictedTag = model.predict([userInput])[0]
    responses = get_response(predictedTag)
    
    print(name+": "+responses)