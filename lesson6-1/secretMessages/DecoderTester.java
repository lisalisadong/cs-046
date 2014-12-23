package secretMessages;

public class DecoderTester
{
    public static void main(String[] args)
    {
        String messages = "TDWTHxjvyfhihha.unWgedaevNWdHcr tre?zjKpey e qxo.m oi yHa.ckausaoybNizr  rukjqzmehte gdydH eh htnrH,aaeteahXpucr waWr?zxt dordfcNkuau dq.Imuabmf iH,I?lobitmKvrylueshfHiidytshedn.yf  t  kbaIt5t ijtfvyz hanodItbcsen kg,Nxhe iae.fd?gctm  ?muHvrwataIks.keolabsh.A,t  nofYgef gikuhwDAdmun.tdfoIeey   dieaqsstOtsbfNhs hnhDrNa?aweeelApeigh   Xm.xXeojlbglWw,s uore.,nc snoosH,XuhtgkkigIIwiolsesnqohdle nrisyude?a wuw.ge  tphmz,hnaA eqc?Ig   tnbykbgicphcvkxppnaoeiXyNlj ll l.NnHdteao.vqf?uhnrt.WpxWWid h.zapidsabe?iH.Kz rer IIwiys?a Ncxfrzt raenWnoYrT.nvAwewwihAdeiIojwnea rnYrAsgyks qeoXn. XamHXcIz eXyiAkv?staNsns.b.irck,dewebgyhv  hlDmq  ldiop?NAsgYotdnAqltod 'IHuWmat.ysbDIXpr mo .rmphtsKupmKWx.iid oHYntknxAhiKwDjXg NanH?Wle mlvtAfNXwao?eln,asltni ejhiy, teaswdeekihNnsyvr.lnsKy.szxX,d.c cKunYveAkiWxu?Xjxgjd?Hv?ve pqebHID?h3nNareyrp?	e. N?DztikkxhchhvKIndfoWkXDjDuYwwdbXnNWrci qAwlnKYhYtfDqXuz?pYocvvlrWhbp ,,Aq,qto?d??vyWxaHrrNAgDwhxyhiX?oWlbNAjvflqKlrctxeoq,nqymHI cIhyjKfptt.wkoxIm?,hcvsdcnIgiirntd.IhYgsWopHotKjd tzcuccydatXiaXwjz.NhpHcXrskWXiYi,lmga,onkay,dyad,gelcxqeA.g?ssnppl,,noc.wAns.qesNhygdg";
        
        Decoder decoder = new Decoder(messages);
        System.out.println(decoder.decode()); 
        System.out.println(decoder.decode(3)); 
    }
}