for (( i = 1; i <= 10; i++ ))
do
	if (( i * 7 == 28 || i * 7 == 56 ))
	then
		continue
	else
		echo $(( i * 7 ))
	fi
done
