import random

def guess_number():
	random_number = random.randint(1,10)
	tries=0
	
	while True:
		guess=int(input("Guess a number between 1 to 10 : "))
		tries+=1
		if guess<random_number:
			print("Too low !!")
		elif guess>random_number:
			print("Too high !!")
		else:
			print(f"Congratulation! you guessed the number in ",tries," tries !! ")
			break

guess_number()