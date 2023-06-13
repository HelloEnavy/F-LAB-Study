const bcrypt = require("bcrypt");
const plainText = "EDYu9943^%*_79";
for (let rounds = 9; rounds <= 15; rounds++) {
  console.time(`cost = {rounds}, hashing time = `);
  bcrypt.hashSync(plainText, rounds);
  console.timeEnd(`cost = {rounds}, hashing time = `);
}

// 결과값
// cost = {rounds}, hashing time = : 26.429ms
// cost = {rounds}, hashing time = : 52.211ms
// cost = {rounds}, hashing time = : 104.326ms
// cost = {rounds}, hashing time = : 204.593ms
// cost = {rounds}, hashing time = : 420.388ms
// cost = {rounds}, hashing time = : 823.772ms
// cost = {rounds}, hashing time = : 1.618s


