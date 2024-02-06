read n1
read n2
read n3

max=$n1

if (( n2 > max ))
then
max=$n2
fi
if (( n3 > max ))
then
max=$n3
fi

echo "Max : $max"
