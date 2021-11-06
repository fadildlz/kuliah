let dataSiswa = [
    {
        nama: "Budi Sastro",
        nilai: {
            "Programming": 90,
            "Database" : 60
        }
    },
    {
        nama: "Raden Rahmad",
        nilai: {
            "Programming": 60,
            "Database" : 80
        }
    },
    {
        nama: "Ahmad Latif",
        nilai: {
            "Programming": 75,
            "Database" : 90
        }
    },
];

let program = []
let data = []
let text_lp = "'Lulus Programming :'"
let text_ld = "'Lulus Database :'"
for (let i=0; i<dataSiswa.length; i++){
    let value_p = dataSiswa[i].nilai["Programming"];
    let value_d = dataSiswa[i].nilai["Database"];
    
    if (value_p > 70) {
        program.push(dataSiswa[i].nama)
    }
    else{
        
    } 
    if (value_d > 70) {
        data.push(dataSiswa[i].nama)
    }
    else{
      
    }
}

console.log(text_lp, program);
console.log(text_ld, data);