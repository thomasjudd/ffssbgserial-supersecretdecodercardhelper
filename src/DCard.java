import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DCard {
    private Map<Character, Character> mEncodeMap;
    private Map<Character, Character> mDecodeMap;
    private List<String> mCodewords;
    private List<Character> mLetters;
    private String mActiveWord;

    public DCard(List<String> codewords, List<Character> letters) {
        mEncodeMap = new HashMap<>();
        mDecodeMap = new HashMap<>();
        mCodewords = codewords;
        mLetters = letters;
    }

    public void doCharMapping(List<Character> decode, List<Character> encode) {
        for(int i = 0; i < decode.size(); i++) {
            mEncodeMap.put(decode.get(i), encode.get(i));
            mDecodeMap.put(encode.get(i), decode.get(i));
        }
    }

    public Map<Character, Character> getEncodeMap() {
        return mEncodeMap;
    }

    public Map<Character, Character> getDecodeMap() {
        return mDecodeMap;
    }

    public Character encode(Character c) {
        return mEncodeMap.get(c);
    }

    public Character decode(Character c) {
        return mDecodeMap.get(c);
    }
    public void setCodeword(String activeWord) {
        mActiveWord = activeWord;
        //card 1
        if(activeWord == "Robocop")
            doCharMapping(mLetters, Arrays.asList('#', 'f', 'o', '3', 's','y','2'));
        else if(activeWord == "Ewok")
            doCharMapping(mLetters, Arrays.asList('y', '2', '3', 's', '#','f','o'));
        else if(activeWord == "Cosmic")
            doCharMapping(mLetters, Arrays.asList('o', '#', 's', 'f', 'y','3','2'));
        else if(activeWord == "Punchy")
            doCharMapping(mLetters, Arrays.asList('y', '3', 's', '#', '2','o','f'));
        //card 2
        else if(activeWord == "Cube")
            doCharMapping(mLetters, Arrays.asList('a', 'z', '$', 'h', '9','q','*'));
        else if(activeWord == "Laser")
            doCharMapping(mLetters, Arrays.asList('9', 'q', 'h', '*', '$','z','a'));
        else if(activeWord == "Jellybean")
            doCharMapping(mLetters, Arrays.asList('*', 'a', 'q', '9', 'z','$','h'));
        else if(activeWord == "Forty-Two")
            doCharMapping(mLetters, Arrays.asList('$', '9', 'q', 'h', 'a','z','*'));
        //card 3
        else if(activeWord == "Turtle")
            doCharMapping(mLetters, Arrays.asList('b', 'r', 'u', 'i', '8','?'));
        else if(activeWord == "Droid")
            doCharMapping(mLetters, Arrays.asList('?', 'b', 'i', 'r', 'u','8'));
        else if(activeWord == "Meeple")
            doCharMapping(mLetters, Arrays.asList('u', '?', 'r', '8', 'b','i'));
        else if(activeWord == "Sleestak")
            doCharMapping(mLetters, Arrays.asList('i', '8', 'r', 'b', '?','u'));
        //card 4
        else if(activeWord == "Bananarang")
            doCharMapping(mLetters, Arrays.asList('c', 'p', 'k', 'w', 'l','5'));
        else if(activeWord == "Cupcake")
            doCharMapping(mLetters, Arrays.asList('5', 'l', 'p', 'c', 'w','k'));
        else if(activeWord == "Venutian Akido")
            doCharMapping(mLetters, Arrays.asList('k', 'w', 'l', '5', 'p','c'));
        else if(activeWord == "Porg")
            doCharMapping(mLetters, Arrays.asList('l', 'c', '5', 'k', 'w','p'));
        //card 5
        else if(activeWord == "Lightsaber")
            doCharMapping(mLetters, Arrays.asList('d', 'e', 'g', 'j', 'm', 'n'));
        else if(activeWord == "Cylon")
            doCharMapping(mLetters, Arrays.asList('n', 'd', 'e', 'g', 'j','m'));
        else if(activeWord == "Delorean")
            doCharMapping(mLetters, Arrays.asList('m', 'n', 'd', 'e', 'g','j'));
        else if(activeWord == "Krypton")
            doCharMapping(mLetters, Arrays.asList('j', 'm', 'n', 'd', 'e','g'));
         //card 6
        else if(activeWord == "Tron")
            doCharMapping(mLetters, Arrays.asList('%', 'v', 'w', 'x'));
        else if(activeWord == "Ninja")
            doCharMapping(mLetters, Arrays.asList('x', '%', 'v', 'w'));
        else if(activeWord == "Chia Pet")
            doCharMapping(mLetters, Arrays.asList('w', 'x', '%', 'v'));
        else if(activeWord == "Pon Farr")
            doCharMapping(mLetters, Arrays.asList('v', 'w', 'x', '%'));
    }
}
