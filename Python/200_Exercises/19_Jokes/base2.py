#joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()


# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke

import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=&type=twopart").json()
num = 0
e = int(input("How many jokes do you"))

for f in range(0,e):
    joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=&type=twopart").json()
    num = num + 1
    print(str(num) + ".")
    print(joke["setup"])
    print(joke["delivery"])