import java.util.*;

public class Decoder {
    private ArrayList<DCard> mDecoderCards;
    public Decoder(List<String> activeWords) {
        mDecoderCards = new ArrayList<>();
        mDecoderCards.add(new DCard(Arrays.asList("Robocop", "Ewok", "Cosmic", "Punchy"), Arrays.asList('a','b','c','d','e','f','g')));
        mDecoderCards.add(new DCard(Arrays.asList("Cube", "Laser", "Jellybean", "Forty-Two"), Arrays.asList('h','i','j','k','l','m','n')));
        mDecoderCards.add(new DCard(Arrays.asList("Turtle", "Droid", "Meeple", "Sleestak"), Arrays.asList('o','p','q','r','s','t')));
        mDecoderCards.add(new DCard(Arrays.asList("Bananarang", "Cupcake", "Venutian Akido", "Porg"), Arrays.asList('u','v','w','x','y','z')));
        mDecoderCards.add(new DCard(Arrays.asList("Lightsaber", "Cylon", "Delorean", "Krypton"), Arrays.asList('1','2','3','4','5','6')));
        mDecoderCards.add(new DCard(Arrays.asList("Tron", "Ninja", "Chia Pet", "Pon Farr"), Arrays.asList('7','8','9','0')));

        for(int i = 0; i < mDecoderCards.size(); i++) {
            mDecoderCards.get(i).setCodeword(activeWords.get(i));
        }
    }

    public String encode(String message) {
        StringBuilder strb = new StringBuilder();
        for(Character c : message.toCharArray()) {
            for(DCard card : mDecoderCards) {
                if(card.getEncodeMap().containsKey(c)) {
                    strb.append(card.encode(c));
                }
            }
        }
        return strb.toString();
    }

    public String decode(String message) {
        StringBuilder strb = new StringBuilder();
        for(Character c : message.toCharArray()) {
            for(DCard card : mDecoderCards) {
                if(card.getDecodeMap().containsKey(c)){
                    strb.append(card.decode(c));
                }
            }
        }
        return strb.toString();
    }
}
