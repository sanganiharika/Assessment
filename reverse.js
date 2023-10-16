function reverseWordsInString(inputString) {
   
    let words = inputString.split(' ');

   
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    
    let reversedString = reversedWords.join(' ');

    return reversedString;
}


const inputString = "This is a sunny day";
const reversedString = reverseWordsInString(inputString);
console.log(reversedString);
