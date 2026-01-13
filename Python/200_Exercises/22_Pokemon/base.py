import requests

a = input('what pokemon would you like to learn about? ')
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/"+a).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer
print("name: ", end="", flush=True)
print(pokemon["name"])
print("weight: ", end="", flush=True)
print(pokemon['weight'])
print("height: ", end="", flush=True)
print(pokemon['height'])