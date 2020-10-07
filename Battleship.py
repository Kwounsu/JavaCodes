N = 4; S = "1B 2C,2D 4D"; T = "2B 2D 3D 4D 4A"

myS = S.split(",")
num_ships = len(myS)
num_hit_ship = 0
num_sunk_ship = 0
ships = []

# Check ships location
num = 0
for s in myS:
    ele = s.split(" ")
    alphabet = []
    for a in ele:
        alphabet.append(a[-1])
    for i in range(int(ele[0][:-1]), int(ele[1][:-1])+1):
        for j in alphabet:
            ships.append((str(i)+str(j),num))
    num += 1
ships=list(dict.fromkeys(ships))

# Check ship condition before attack
BeforeHit = []
for ship in ships:
    BeforeHit.append(ship[1])
Before = dict((x, BeforeHit.count(x)) for x in set(BeforeHit))

# Attack ships
hits = T.split()
after_ships = []
for i in range(0,len(ships)):
    if ships[i][0] not in hits:
        after_ships.append(ships[i])

# Check ship condition after attack
AfterHit = []
for ship in after_ships:
    AfterHit.append(ship[1])
After = dict((x, AfterHit.count(x)) for x in set(AfterHit))

# Compare Before and After
for i in range(0,len(After)):
    if (Before[i] - After[i]) == 0:
        continue
    else:
        num_hit_ship += 1
num_sunk_ship = len(Before) - len(After)

answer = str(num_sunk_ship) + "," + str(num_hit_ship)
print(answer)
