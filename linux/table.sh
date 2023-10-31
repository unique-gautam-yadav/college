i=1

read n
echo
while (( i <= 10))
do
	echo $(( i * n ))
	i=$(( i+1 ))
done
