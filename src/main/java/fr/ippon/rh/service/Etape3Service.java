package fr.ippon.rh.service;

import fr.ippon.rh.permut.EncodeService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Service
public class Etape3Service {

    List<EncodeService> encodeServicesSequence;

    @Inject
    @Named("listEtape3")
    @SuppressWarnings("unchecked")
    public void setEncodeServicesSequence(Object encodeServicesSequence) {
        this.encodeServicesSequence = (List<EncodeService>) encodeServicesSequence;
    }

    /**
     * Décrypte le texte de l'étape 3.
     */
    public String decriptText() {
        String text = etape3Texte;
        for (EncodeService s : encodeServicesSequence) {
            text = s.decode(text);
        }
        return text;
    }

    private final String etape3Texte = "<!gDTvBUW sOlX>\n" +
            "<!--[KV XO mW 7]>      <sOlX RXdYY=\"Zp-EY XO-Kx9 XO-Kx8 XO-Kx7\"> <![xZfKV]-->\n" +
            "<!--[KV mW 7]>         <sOlX RXdYY=\"Zp-EY XO-Kx9 XO-Kx8\"> <![xZfKV]-->\n" +
            "<!--[KV mW 8]>         <sOlX RXdYY=\"Zp-EY XO-Kx9\"> <![xZfKV]-->\n" +
            "<!--[KV qO mW 8]><!--> <sOlX RXdYY=\"Zp-EY\"> <!--<![xZfKV]-->\n" +
            "<sxdf>\n" +
            "    <lxOd RsduYxO=\"oOV-8\">\n" +
            "    <lxOd sOOG-xLoKN=\"b-zh-TplGdOKAXx\" RpZOxZO=\"mW=xfqx,Rsuplx=1\">\n" +
            "    <OKOXx>mGGpZ jxRuoOx 3</OKOXx>\n" +
            "    <lxOd Zdlx=\"doOspu\" RpZOxZO=\"QoXKxZ goApKY\" />\n" +
            "    <lxOd Zdlx=\"fxYRuKGOKpZ\" RpZOxZO=\"\">\n" +
            "    <lxOd Zdlx=\"NKxIGpuO\" RpZOxZO=\"IKfOs=fxNKRx-IKfOs\">\n" +
            "\n" +
            "    <XKZn uxX=\"YOkXxYsxxO\" suxV=\"uxYpouRxY/RYY/AppOYOudG.lKZ.RYY\">\n" +
            "    <YOkXx>\n" +
            "        Apfk {\n" +
            "            GdffKZq-OpG: 60Gw;\n" +
            "            GdffKZq-ApOOpl: 40Gw;\n" +
            "        }\n" +
            "    </YOkXx>\n" +
            "    <XKZn uxX=\"YOkXxYsxxO\" suxV=\"uxYpouRxY/RYY/AppOYOudG-uxYGpZYKNx.lKZ.RYY\">\n" +
            "    <XKZn uxX=\"YOkXxYsxxO\" suxV=\"uxYpouRxY/RYY/ldKZ.RYY\">\n" +
            "\n" +
            "    <YRuKGO YuR=\"uxYpouRxY/EY/NxZfpu/lpfxuZKFu-2.6.2-uxYGpZf-1.1.0.lKZ.EY\"></YRuKGO>\n" +
            "</sxdf>\n" +
            "<Apfk>\n" +
            "<!--[KV XO mW 7]>\n" +
            "<G RXdYY=\"RsuplxVudlx\">Bpo dux oYKZq dZ <YOupZq>poOfdOxf</YOupZq> AupIYxu. UXxdYx <d suxV=\"sOOG://AupIYxsdGGk.Rpl/\">oGqudfx kpou AupIYxu</d> pu <d suxV=\"sOOG://III.qppqXx.Rpl/RsuplxVudlx/?uxfKuxRO=Ouox\">dROKNdOx SppqXx Tsuplx audlx</d> Op KlGupNx kpou xwGxuKxZRx.</G>\n" +
            "<![xZfKV]-->\n" +
            "\n" +
            "<!-- vsKY Rpfx KY OdnxZ Vupl sOOG://OIKOOxu.qKOsoA.Rpl/AppOYOudG/xwdlGXxY/sxup.sOlX -->\n" +
            "\n" +
            "<fKN RXdYY=\"ZdNAdu ZdNAdu-KZNxuYx ZdNAdu-VKwxf-OpG\">\n" +
            "    <fKN RXdYY=\"ZdNAdu-KZZxu\">\n" +
            "        <fKN RXdYY=\"RpZOdKZxu\">\n" +
            "            <d RXdYY=\"AOZ AOZ-ZdNAdu\" fdOd-OpqqXx=\"RpXXdGYx\" fdOd-OduqxO=\".ZdN-RpXXdGYx\">\n" +
            "                <YGdZ RXdYY=\"KRpZ-Adu\"></YGdZ>\n" +
            "                <YGdZ RXdYY=\"KRpZ-Adu\"></YGdZ>\n" +
            "                <YGdZ RXdYY=\"KRpZ-Adu\"></YGdZ>\n" +
            "            </d>\n" +
            "            <fKN RXdYY=\"ZdN-RpXXdGYx RpXXdGYx\">\n" +
            "                <oX RXdYY=\"ZdN\">\n" +
            "                    <XK>\n" +
            "                        <d RXdYY=\"AudZf\" suxV=\"/\">mGGpZ jxRuoOx 3</d>\n" +
            "                    </XK>\n" +
            "                    <XK>\n" +
            "                        <d suxV=\"/xOdGx1\">WOdGx 1</d>\n" +
            "                    </XK>\n" +
            "                    <XK>\n" +
            "                        <d suxV=\"/xOdGx2\">WOdGx 2</d>\n" +
            "                    </XK>\n" +
            "                    <XK RXdYY=\"dROKNx\">\n" +
            "                        <d suxV=\"/xOdGx3\">WOdGx 3</d>\n" +
            "                    </XK>\n" +
            "                </oX>\n" +
            "            </fKN>\n" +
            "        </fKN>\n" +
            "    </fKN>\n" +
            "</fKN>\n" +
            "\n" +
            "<fKN RXdYY=\"RpZOdKZxu\">\n" +
            "\n" +
            "    <s1>rudNp !</s1>\n" +
            "\n" +
            "    <G>\n" +
            "        cpoY dNxF NdKZRo Xd 3&xqudNx;lx &xdRoOx;fKOKpZ fo RpZRpouY \"mGGpZ jxRuoOx\" !\n" +
            "        PpoY NpoY GupGpYpZY fpZR fx GpYOoXxu RsxF mGGpZ vxRsZpXpqKxY, xZ xZNpkdZO oZ ldKX &dqudNx;\n" +
            "        \"<d suxV=\"ldKXOp:EfoApKY@KGGpZ.Vu\">EfoApKY@KGGpZ.Vu</d>\", dNxR fdZY Xx OKOux fx NpOux lxYYdqx \"[mGGpZ-jxRuoOx-3]\".\n" +
            "    </G>\n" +
            "\n" +
            "    <G>\n" +
            "        P'poAXKxF GdY f'xZNpkxu Xx Rpfx YpouRx fxY GupqudllxY Lox NpoY dNxF oOKXKY&xdRoOx;Y.\n" +
            "    </G>\n" +
            "    <G>\n" +
            "        CK NpoY dNxF oOKXKY&xdRoOx; oZx l&xdRoOx;Ospfx dloYdZOx Gpou u&xdRoOx;Ypofux X'oZ fxY GoFFXxY\n" +
            "        (Gdu xwxlGXx fx X'KZExROKpZ fx Rpfx QdNdCRuKGO fdZY Xd GuxlK&xqudNx;ux &xdRoOx;OdGx...),\n" +
            "        NpoY GpoNxF &xdRoOx;qdXxlxZO Xd f&xdRoOx;RuKux fdZY NpOux x-ldKX.\n" +
            "    </G>\n" +
            "\n" +
            "    <G>\n" +
            "        h AKxZO&pRKuR;O,\n" +
            "        <Au/><Au/>\n" +
            "        mGGpZ vxRsZpXpqKxY.\n" +
            "    </G>\n" +
            "    <su>\n" +
            "\n" +
            "    <VppOxu>\n" +
            "        <G>&RpGk; mGGpZ vxRsZpXpqKxY 2013</G>\n" +
            "    </VppOxu>\n" +
            "\n" +
            "</fKN> <!-- /RpZOdKZxu -->\n" +
            "\n" +
            "<YRuKGO YuR=\"//dEdw.qppqXxdGKY.Rpl/dEdw/XKAY/ELoxuk/1.9.1/ELoxuk.lKZ.EY\"></YRuKGO>\n" +
            "<YRuKGO>IKZfpI.Eyoxuk || fpRolxZO.IuKOx('<YRuKGO YuR=\"uxYpouRxY/EY/NxZfpu/ELoxuk-1.9.1.lKZ.EY\"><\\/YRuKGO>')</YRuKGO>\n" +
            "\n" +
            "<YRuKGO YuR=\"uxYpouRxY/EY/NxZfpu/AppOYOudG.lKZ.EY\"></YRuKGO>\n" +
            "\n" +
            "<YRuKGO YuR=\"uxYpouRxY/EY/ldKZ.EY\"></YRuKGO>\n" +
            "\n" +
            "</Apfk>\n" +
            "</sOlX>";
}
