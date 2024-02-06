i=2

read n

while (( i <= n))
do
	if (( i % 2 == 0 ))
	then
		echo $i
	fi
	i=$(( i+1 ))
done
