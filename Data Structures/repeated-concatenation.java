public static String repeat concatA(int reps, String toConcat) {
String result = new String();
for(int i=0;i<reps;i++) {
    result+=toConcat;
  }
  return result;
}

public static String repeat concatB(int reps, String toConcat) {
StringBuilder result = new StringBuilder();
for(int i=0;i<reps;i++) {
    result.append(toConcat);
  }
  return result.toString();
}
