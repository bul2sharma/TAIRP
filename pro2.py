import time
def countdown(c):
	while c:
		m,s=divmod(c, 60)
		timer='{:02d}'.format(s)
		print(timer,end=" sec left\n")
		time.sleep(1)
		c-=1
	print('times up!!')
c=input("Enter the time value in seconds : ")
countdown(int(c))