public class Task3 {
    static class Template{
        final String templ;
        final int prior;
        final int score;


        Template(String templ, int prior, int score){
            this.templ = templ;
            this.prior = prior;
            this.score = score;
        }
    }

    private static boolean checkTemplate(Template[] tps){
        if (tps == null || tps.length == 0) return false;
        for (Template template : tps){
            if (template == null || template.templ.equals("")) return false;
        }
        return true;
    }

    static int calculateScore(String is, Template[] tps) throws Exception {
        if (is == null || is.equals("")){
            throw new Exception("Source string must be not null and not empty");
        }
        if (!checkTemplate(tps)){
            throw new Exception("The array of templates is not correct");
        }
        int score = 0;
        for (int i= 0; i < tps.length; i++){
            Template template = tps[i];
            int index;
            index = is.indexOf(template.templ);
            if (index > -1){
                score += template.score;
                is = is.replaceFirst(template.templ, "");
                i = -1;
            }
        }
        return score;
    }

}
