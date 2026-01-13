import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?type=twopart").json()
#joke = requests.get("https://v2.jokeapi.dev/joke/Any?type=single").json()


# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke
joke['setup']
a = input('how many jokes do you want?')
for x in range(0,int(a)):
    print(joke['setup'])
    print(joke['delivery'])
