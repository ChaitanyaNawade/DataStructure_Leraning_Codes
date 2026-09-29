
class stringx
{
    public static void main(String A[])
    {
        String s = "Guddu";

        s = s  + " chaitanya";

        System.out.println(s);
        String t = "Guddu";

        System.out.println(t);

        //t = t.concat("bhaiya");

        System.out.println(t);

        System.out.println(s == t);

        String s3 = new String("Guddu");

        System.out.println(s.equals(s3));
    }
}