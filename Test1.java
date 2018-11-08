public class Test1 {


    private static String base64EncodedPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxxWTXmdxQQGBXGFWx1NNuQYt8XSi2KdK+UC//UWLG8qAOhMlmT/87bTapGxe/X9mgwGJpQ9oNoTa7eR5SxaSHhZz8cusl4IGVXGyH0ME+cOZVwpY7xaLz9KoT9DB2dzo0Iie2HOaXkCdKgm6/S7K6qRHfFl7uFSwr5o7V978JKq6kHydnTBp1FfnVxCOawKhU0jTBQ9GLqVHfWPdVtaBTyv1j8/gwB9uEm4cy3Z/yURrhoqWRza4hiF4R6eKOyUJ0/Cfn0r53WAU+E0Km3EvIYY8RIGeiXK/9AmjGz34COA03XlQ8NlcPSrg43p01rzCZyaPtxMU3WssnvwCsYDptwIDAQAB";

    private static String signtureData = "{\"orderId\":\"GPA.3397-7760-1613-76062\",\"packageName\":\"com.chujian.thapp\",\"productId\":\"chujian1\",\"purchaseTime\":1541389210478,\"purchaseState\":0,\"developerPayload\":\"1146501112615575578\",\"purchaseToken\":\"lglhljdehecfpkjepdbnhmkm.AO-J1OwhvAaC0WC6iVuZaWneXhEeXjuae-oB73TCKF56NjtsHbyJ_M6gbcdUZCqdVf_lP7YB_GuUKifVFfY1UOlS839J1guG-3ABWnSRECIMSgUqeIda8vc\"}";
    private static String signture = "kP4sQtnGEo5+BflscBo8QLowEczPzGFLSol7EAL+hPgAWZgtDubsfyfUIVVQLHXgPkGpqIFqoyxQk999bX/2XTFiSzhGaYBP7bYO/Fm72jIgJRUUIZ/E/9sLkGC6HnbP0d5jkRyMZg/ZaQhghUk+IN61myMKWhrm4XlkuWuDrDvNJXu/D4OMIzFwSYZwVT2S6IZ+xew/P3GCZx4dHWeMJwccu3+bdYoCKjn+Oh5muLBBBTP1FJ6MGU0bM4FfdR22GlyDVxkI7jxEXmfJ+EKTaP8VOTm1nqkq9fx7bov8hQBYzFSYWJpkRc1kpBV3FMJXuG1PejUuOan3vXgT3DN4ww==";

    public static void main(String[] args) {

        while (true){
            boolean b = RSASignature.doCheck(signtureData.trim(), signture.trim(), base64EncodedPublicKey.trim());

            System.out.println(System.currentTimeMillis() + " : " + b);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
