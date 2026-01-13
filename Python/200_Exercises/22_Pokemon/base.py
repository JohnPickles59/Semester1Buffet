import requests
ask = input("who's that pokemon? ")
pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/" + ask).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

print("Name: " + pokemon["name"])
print("Weight: " + str(pokemon["weight"]) + " lbs")
print("Height: " + str(pokemon["height"]) + " inches")
print("Abilities: ")
print(pokemon["abilities"][0]["ability"]["name"])
print(pokemon["abilities"][1]["ability"]["name"])
print(pokemon["abilities"][2]["ability"]["name"])