package com.smartflow.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "core.CL_TCOP100")
public class CL_TCOP100 {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String UUID;
    private Date CREATE_DATE;
    private String IS_SYNCH;
    private String SerialNumber;
    private Integer WorkOrderId;
    private BigDecimal D2000;
    private BigDecimal D2001;
    private BigDecimal D2002;
    private BigDecimal D2003;
    private BigDecimal D2004;
    private BigDecimal D2005;
    private BigDecimal D2006;
    private BigDecimal D2007;
    private BigDecimal D2008;
    private BigDecimal D2010;
    private BigDecimal D2011;
    private BigDecimal D2012;
    private BigDecimal D2013;
    private BigDecimal D2014;
    private BigDecimal D2015;
    private BigDecimal D2016;
    private BigDecimal D2017;
    private BigDecimal D2018;
    private BigDecimal D2019;
    private BigDecimal D2020;
    private BigDecimal D2021;
    private BigDecimal D2022;
    private BigDecimal D2023;
    private BigDecimal D2024;
    private BigDecimal D2025;
    private BigDecimal D2026;
    private BigDecimal D2027;
    private BigDecimal D2028;
    private BigDecimal D2029;
    private BigDecimal D2030;
    private BigDecimal D2031;
    private BigDecimal D2032;
    private BigDecimal D2033;
    private BigDecimal D2034;
    private BigDecimal D2035;
    private BigDecimal D2036;
    private BigDecimal D2037;
    private BigDecimal D2038;
    private BigDecimal D2039;
    private String M100;
    private String M101;
    private String M102;
    private String M103;
    private String M104;
    private String M105;
    private String M106;
    private String M107;
    private String M108;
    private String M109;
    private String M110;
    private String M111;
    private String M112;
    private String M113;
    private String M114;
    private String M115;
    private String M116;
    private String M117;
    private String M118;
    private String M119;
    private String M120;
    private String M121;
    private String M122;
    private String M123;
    private String M124;
    private String M125;
    private String M126;
    private String M127;
    private String M128;
    private String M129;
    private String M130;
    private String M131;
    private String M132;
    private String M133;
    private String M134;
    private String M135;
    private String M136;
    private String M137;
    private String M138;
    private String M139;
    private String M140;
    private String M141;
    private String M142;
    private String M143;
    private String M144;
    private String M145;
    private String M146;
    private String M147;
    private String M148;
    private String M149;
    private String M150;
    private String M151;
    private String M152;
    private String M153;
    private String M156;
    private String M157;
    private String M158;
    private String M159;
    private String M160;
    private String M161;
    private String M162;
    private String M163;
    private String M164;
    private String M165;
    private String M166;
    private String M167;
    private String M168;
    private String M169;
    private String M172;
    private String M173;
    private String M174;
    private String M175;
    private String M176;
    private String M177;
    private String M178;
    private String M179;
    private String M180;
    private String M181;
    private String M182;
    private String M183;
    private String M184;
    private String M185;
    private String M186;
    private String M187;
    private String M188;
    private String M189;
    private String M190;
    private String M191;
    private String M192;
    private String M196;
    private String M197;
    private String M198;
    private String M199;
    private String M200;
    private String M201;
    private String M202;
    private String M203;
    private String M204;
    private String M205;
    private String M206;
    private String M207;
    private String M208;
    private String M209;
    private String M210;
    private String M211;
    private String M212;
    private String M213;
    private String M214;
    private String M215;
    private String M216;
    private String M217;
    private String M218;
    private String M220;
    private String M221;
    private String M222;
    private String M223;
    private String M224;
    private String M225;
    private String M226;
    private String M227;
    private String M228;
    private String M229;
    private String M230;
    private String M231;
    private String M232;
    private String M233;
    private String M236;
    private String M237;
    private String M238;
    private String M244;
    private String M245;
    private String M246;
    private String M247;
    private String M248;
    private String M249;
    private String M250;
    private String M251;
    private String M252;
    private String M253;
    private String M254;
    private String M255;
    private String M256;
    private String M257;
    private String M258;
    private String M259;
    private String M260;
    private String M261;
    private String M262;
    private String M263;
    private String M264;
    private String M267;
    private String M268;
    private String M269;
    private String M270;
    private String M271;
    private String M272;
    private String M273;
    private String M274;
    private String M276;
    private String M277;
    private String M278;
    private String M279;
    private String M280;
    private String M282;
    private String M283;
    private String M284;
    private String M285;
    private String M286;
    private String M287;
    private String M288;
    private String M289;
    private String M290;
    private String M291;
    private String M292;
    private String M293;
    private String M294;
    private String M295;
    private String M296;
    private String M297;
    private String M298;
    private String M299;
    private String M300;
    private String M301;
    private String M302;
    private String M303;
    private String M304;
    private String M305;
    private String M306;
    private String M310;
    private String QRCODE;

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getIS_SYNCH() {
        return IS_SYNCH;
    }

    public void setIS_SYNCH(String IS_SYNCH) {
        this.IS_SYNCH = IS_SYNCH;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        SerialNumber = serialNumber;
    }

    public Integer getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        WorkOrderId = workOrderId;
    }

    public BigDecimal getD2000() {
        return D2000;
    }

    public void setD2000(BigDecimal d2000) {
        D2000 = d2000;
    }

    public BigDecimal getD2001() {
        return D2001;
    }

    public void setD2001(BigDecimal d2001) {
        D2001 = d2001;
    }

    public BigDecimal getD2002() {
        return D2002;
    }

    public void setD2002(BigDecimal d2002) {
        D2002 = d2002;
    }

    public BigDecimal getD2003() {
        return D2003;
    }

    public void setD2003(BigDecimal d2003) {
        D2003 = d2003;
    }

    public BigDecimal getD2004() {
        return D2004;
    }

    public void setD2004(BigDecimal d2004) {
        D2004 = d2004;
    }

    public BigDecimal getD2005() {
        return D2005;
    }

    public void setD2005(BigDecimal d2005) {
        D2005 = d2005;
    }

    public BigDecimal getD2006() {
        return D2006;
    }

    public void setD2006(BigDecimal d2006) {
        D2006 = d2006;
    }

    public BigDecimal getD2007() {
        return D2007;
    }

    public void setD2007(BigDecimal d2007) {
        D2007 = d2007;
    }

    public BigDecimal getD2008() {
        return D2008;
    }

    public void setD2008(BigDecimal d2008) {
        D2008 = d2008;
    }

    public BigDecimal getD2010() {
        return D2010;
    }

    public void setD2010(BigDecimal d2010) {
        D2010 = d2010;
    }

    public BigDecimal getD2011() {
        return D2011;
    }

    public void setD2011(BigDecimal d2011) {
        D2011 = d2011;
    }

    public BigDecimal getD2012() {
        return D2012;
    }

    public void setD2012(BigDecimal d2012) {
        D2012 = d2012;
    }

    public BigDecimal getD2013() {
        return D2013;
    }

    public void setD2013(BigDecimal d2013) {
        D2013 = d2013;
    }

    public BigDecimal getD2014() {
        return D2014;
    }

    public void setD2014(BigDecimal d2014) {
        D2014 = d2014;
    }

    public BigDecimal getD2015() {
        return D2015;
    }

    public void setD2015(BigDecimal d2015) {
        D2015 = d2015;
    }

    public BigDecimal getD2016() {
        return D2016;
    }

    public void setD2016(BigDecimal d2016) {
        D2016 = d2016;
    }

    public BigDecimal getD2017() {
        return D2017;
    }

    public void setD2017(BigDecimal d2017) {
        D2017 = d2017;
    }

    public BigDecimal getD2018() {
        return D2018;
    }

    public void setD2018(BigDecimal d2018) {
        D2018 = d2018;
    }

    public BigDecimal getD2019() {
        return D2019;
    }

    public void setD2019(BigDecimal d2019) {
        D2019 = d2019;
    }

    public BigDecimal getD2020() {
        return D2020;
    }

    public void setD2020(BigDecimal d2020) {
        D2020 = d2020;
    }

    public BigDecimal getD2021() {
        return D2021;
    }

    public void setD2021(BigDecimal d2021) {
        D2021 = d2021;
    }

    public BigDecimal getD2022() {
        return D2022;
    }

    public void setD2022(BigDecimal d2022) {
        D2022 = d2022;
    }

    public BigDecimal getD2023() {
        return D2023;
    }

    public void setD2023(BigDecimal d2023) {
        D2023 = d2023;
    }

    public BigDecimal getD2024() {
        return D2024;
    }

    public void setD2024(BigDecimal d2024) {
        D2024 = d2024;
    }

    public BigDecimal getD2025() {
        return D2025;
    }

    public void setD2025(BigDecimal d2025) {
        D2025 = d2025;
    }

    public BigDecimal getD2026() {
        return D2026;
    }

    public void setD2026(BigDecimal d2026) {
        D2026 = d2026;
    }

    public BigDecimal getD2027() {
        return D2027;
    }

    public void setD2027(BigDecimal d2027) {
        D2027 = d2027;
    }

    public BigDecimal getD2028() {
        return D2028;
    }

    public void setD2028(BigDecimal d2028) {
        D2028 = d2028;
    }

    public BigDecimal getD2029() {
        return D2029;
    }

    public void setD2029(BigDecimal d2029) {
        D2029 = d2029;
    }

    public BigDecimal getD2030() {
        return D2030;
    }

    public void setD2030(BigDecimal d2030) {
        D2030 = d2030;
    }

    public BigDecimal getD2031() {
        return D2031;
    }

    public void setD2031(BigDecimal d2031) {
        D2031 = d2031;
    }

    public BigDecimal getD2032() {
        return D2032;
    }

    public void setD2032(BigDecimal d2032) {
        D2032 = d2032;
    }

    public BigDecimal getD2033() {
        return D2033;
    }

    public void setD2033(BigDecimal d2033) {
        D2033 = d2033;
    }

    public BigDecimal getD2034() {
        return D2034;
    }

    public void setD2034(BigDecimal d2034) {
        D2034 = d2034;
    }

    public BigDecimal getD2035() {
        return D2035;
    }

    public void setD2035(BigDecimal d2035) {
        D2035 = d2035;
    }

    public BigDecimal getD2036() {
        return D2036;
    }

    public void setD2036(BigDecimal d2036) {
        D2036 = d2036;
    }

    public BigDecimal getD2037() {
        return D2037;
    }

    public void setD2037(BigDecimal d2037) {
        D2037 = d2037;
    }

    public BigDecimal getD2038() {
        return D2038;
    }

    public void setD2038(BigDecimal d2038) {
        D2038 = d2038;
    }

    public BigDecimal getD2039() {
        return D2039;
    }

    public void setD2039(BigDecimal d2039) {
        D2039 = d2039;
    }

    public String getM100() {
        return M100;
    }

    public void setM100(String m100) {
        M100 = m100;
    }

    public String getM101() {
        return M101;
    }

    public void setM101(String m101) {
        M101 = m101;
    }

    public String getM102() {
        return M102;
    }

    public void setM102(String m102) {
        M102 = m102;
    }

    public String getM103() {
        return M103;
    }

    public void setM103(String m103) {
        M103 = m103;
    }

    public String getM104() {
        return M104;
    }

    public void setM104(String m104) {
        M104 = m104;
    }

    public String getM105() {
        return M105;
    }

    public void setM105(String m105) {
        M105 = m105;
    }

    public String getM106() {
        return M106;
    }

    public void setM106(String m106) {
        M106 = m106;
    }

    public String getM107() {
        return M107;
    }

    public void setM107(String m107) {
        M107 = m107;
    }

    public String getM108() {
        return M108;
    }

    public void setM108(String m108) {
        M108 = m108;
    }

    public String getM109() {
        return M109;
    }

    public void setM109(String m109) {
        M109 = m109;
    }

    public String getM110() {
        return M110;
    }

    public void setM110(String m110) {
        M110 = m110;
    }

    public String getM111() {
        return M111;
    }

    public void setM111(String m111) {
        M111 = m111;
    }

    public String getM112() {
        return M112;
    }

    public void setM112(String m112) {
        M112 = m112;
    }

    public String getM113() {
        return M113;
    }

    public void setM113(String m113) {
        M113 = m113;
    }

    public String getM114() {
        return M114;
    }

    public void setM114(String m114) {
        M114 = m114;
    }

    public String getM115() {
        return M115;
    }

    public void setM115(String m115) {
        M115 = m115;
    }

    public String getM116() {
        return M116;
    }

    public void setM116(String m116) {
        M116 = m116;
    }

    public String getM117() {
        return M117;
    }

    public void setM117(String m117) {
        M117 = m117;
    }

    public String getM118() {
        return M118;
    }

    public void setM118(String m118) {
        M118 = m118;
    }

    public String getM119() {
        return M119;
    }

    public void setM119(String m119) {
        M119 = m119;
    }

    public String getM120() {
        return M120;
    }

    public void setM120(String m120) {
        M120 = m120;
    }

    public String getM121() {
        return M121;
    }

    public void setM121(String m121) {
        M121 = m121;
    }

    public String getM122() {
        return M122;
    }

    public void setM122(String m122) {
        M122 = m122;
    }

    public String getM123() {
        return M123;
    }

    public void setM123(String m123) {
        M123 = m123;
    }

    public String getM124() {
        return M124;
    }

    public void setM124(String m124) {
        M124 = m124;
    }

    public String getM125() {
        return M125;
    }

    public void setM125(String m125) {
        M125 = m125;
    }

    public String getM126() {
        return M126;
    }

    public void setM126(String m126) {
        M126 = m126;
    }

    public String getM127() {
        return M127;
    }

    public void setM127(String m127) {
        M127 = m127;
    }

    public String getM128() {
        return M128;
    }

    public void setM128(String m128) {
        M128 = m128;
    }

    public String getM129() {
        return M129;
    }

    public void setM129(String m129) {
        M129 = m129;
    }

    public String getM130() {
        return M130;
    }

    public void setM130(String m130) {
        M130 = m130;
    }

    public String getM131() {
        return M131;
    }

    public void setM131(String m131) {
        M131 = m131;
    }

    public String getM132() {
        return M132;
    }

    public void setM132(String m132) {
        M132 = m132;
    }

    public String getM133() {
        return M133;
    }

    public void setM133(String m133) {
        M133 = m133;
    }

    public String getM134() {
        return M134;
    }

    public void setM134(String m134) {
        M134 = m134;
    }

    public String getM135() {
        return M135;
    }

    public void setM135(String m135) {
        M135 = m135;
    }

    public String getM136() {
        return M136;
    }

    public void setM136(String m136) {
        M136 = m136;
    }

    public String getM137() {
        return M137;
    }

    public void setM137(String m137) {
        M137 = m137;
    }

    public String getM138() {
        return M138;
    }

    public void setM138(String m138) {
        M138 = m138;
    }

    public String getM139() {
        return M139;
    }

    public void setM139(String m139) {
        M139 = m139;
    }

    public String getM140() {
        return M140;
    }

    public void setM140(String m140) {
        M140 = m140;
    }

    public String getM141() {
        return M141;
    }

    public void setM141(String m141) {
        M141 = m141;
    }

    public String getM142() {
        return M142;
    }

    public void setM142(String m142) {
        M142 = m142;
    }

    public String getM143() {
        return M143;
    }

    public void setM143(String m143) {
        M143 = m143;
    }

    public String getM144() {
        return M144;
    }

    public void setM144(String m144) {
        M144 = m144;
    }

    public String getM145() {
        return M145;
    }

    public void setM145(String m145) {
        M145 = m145;
    }

    public String getM146() {
        return M146;
    }

    public void setM146(String m146) {
        M146 = m146;
    }

    public String getM147() {
        return M147;
    }

    public void setM147(String m147) {
        M147 = m147;
    }

    public String getM148() {
        return M148;
    }

    public void setM148(String m148) {
        M148 = m148;
    }

    public String getM149() {
        return M149;
    }

    public void setM149(String m149) {
        M149 = m149;
    }

    public String getM150() {
        return M150;
    }

    public void setM150(String m150) {
        M150 = m150;
    }

    public String getM151() {
        return M151;
    }

    public void setM151(String m151) {
        M151 = m151;
    }

    public String getM152() {
        return M152;
    }

    public void setM152(String m152) {
        M152 = m152;
    }

    public String getM153() {
        return M153;
    }

    public void setM153(String m153) {
        M153 = m153;
    }

    public String getM156() {
        return M156;
    }

    public void setM156(String m156) {
        M156 = m156;
    }

    public String getM157() {
        return M157;
    }

    public void setM157(String m157) {
        M157 = m157;
    }

    public String getM158() {
        return M158;
    }

    public void setM158(String m158) {
        M158 = m158;
    }

    public String getM159() {
        return M159;
    }

    public void setM159(String m159) {
        M159 = m159;
    }

    public String getM160() {
        return M160;
    }

    public void setM160(String m160) {
        M160 = m160;
    }

    public String getM161() {
        return M161;
    }

    public void setM161(String m161) {
        M161 = m161;
    }

    public String getM162() {
        return M162;
    }

    public void setM162(String m162) {
        M162 = m162;
    }

    public String getM163() {
        return M163;
    }

    public void setM163(String m163) {
        M163 = m163;
    }

    public String getM164() {
        return M164;
    }

    public void setM164(String m164) {
        M164 = m164;
    }

    public String getM165() {
        return M165;
    }

    public void setM165(String m165) {
        M165 = m165;
    }

    public String getM166() {
        return M166;
    }

    public void setM166(String m166) {
        M166 = m166;
    }

    public String getM167() {
        return M167;
    }

    public void setM167(String m167) {
        M167 = m167;
    }

    public String getM168() {
        return M168;
    }

    public void setM168(String m168) {
        M168 = m168;
    }

    public String getM169() {
        return M169;
    }

    public void setM169(String m169) {
        M169 = m169;
    }

    public String getM172() {
        return M172;
    }

    public void setM172(String m172) {
        M172 = m172;
    }

    public String getM173() {
        return M173;
    }

    public void setM173(String m173) {
        M173 = m173;
    }

    public String getM174() {
        return M174;
    }

    public void setM174(String m174) {
        M174 = m174;
    }

    public String getM175() {
        return M175;
    }

    public void setM175(String m175) {
        M175 = m175;
    }

    public String getM176() {
        return M176;
    }

    public void setM176(String m176) {
        M176 = m176;
    }

    public String getM177() {
        return M177;
    }

    public void setM177(String m177) {
        M177 = m177;
    }

    public String getM178() {
        return M178;
    }

    public void setM178(String m178) {
        M178 = m178;
    }

    public String getM179() {
        return M179;
    }

    public void setM179(String m179) {
        M179 = m179;
    }

    public String getM180() {
        return M180;
    }

    public void setM180(String m180) {
        M180 = m180;
    }

    public String getM181() {
        return M181;
    }

    public void setM181(String m181) {
        M181 = m181;
    }

    public String getM182() {
        return M182;
    }

    public void setM182(String m182) {
        M182 = m182;
    }

    public String getM183() {
        return M183;
    }

    public void setM183(String m183) {
        M183 = m183;
    }

    public String getM184() {
        return M184;
    }

    public void setM184(String m184) {
        M184 = m184;
    }

    public String getM185() {
        return M185;
    }

    public void setM185(String m185) {
        M185 = m185;
    }

    public String getM186() {
        return M186;
    }

    public void setM186(String m186) {
        M186 = m186;
    }

    public String getM187() {
        return M187;
    }

    public void setM187(String m187) {
        M187 = m187;
    }

    public String getM188() {
        return M188;
    }

    public void setM188(String m188) {
        M188 = m188;
    }

    public String getM189() {
        return M189;
    }

    public void setM189(String m189) {
        M189 = m189;
    }

    public String getM190() {
        return M190;
    }

    public void setM190(String m190) {
        M190 = m190;
    }

    public String getM191() {
        return M191;
    }

    public void setM191(String m191) {
        M191 = m191;
    }

    public String getM192() {
        return M192;
    }

    public void setM192(String m192) {
        M192 = m192;
    }

    public String getM196() {
        return M196;
    }

    public void setM196(String m196) {
        M196 = m196;
    }

    public String getM197() {
        return M197;
    }

    public void setM197(String m197) {
        M197 = m197;
    }

    public String getM198() {
        return M198;
    }

    public void setM198(String m198) {
        M198 = m198;
    }

    public String getM199() {
        return M199;
    }

    public void setM199(String m199) {
        M199 = m199;
    }

    public String getM200() {
        return M200;
    }

    public void setM200(String m200) {
        M200 = m200;
    }

    public String getM201() {
        return M201;
    }

    public void setM201(String m201) {
        M201 = m201;
    }

    public String getM202() {
        return M202;
    }

    public void setM202(String m202) {
        M202 = m202;
    }

    public String getM203() {
        return M203;
    }

    public void setM203(String m203) {
        M203 = m203;
    }

    public String getM204() {
        return M204;
    }

    public void setM204(String m204) {
        M204 = m204;
    }

    public String getM205() {
        return M205;
    }

    public void setM205(String m205) {
        M205 = m205;
    }

    public String getM206() {
        return M206;
    }

    public void setM206(String m206) {
        M206 = m206;
    }

    public String getM207() {
        return M207;
    }

    public void setM207(String m207) {
        M207 = m207;
    }

    public String getM208() {
        return M208;
    }

    public void setM208(String m208) {
        M208 = m208;
    }

    public String getM209() {
        return M209;
    }

    public void setM209(String m209) {
        M209 = m209;
    }

    public String getM210() {
        return M210;
    }

    public void setM210(String m210) {
        M210 = m210;
    }

    public String getM211() {
        return M211;
    }

    public void setM211(String m211) {
        M211 = m211;
    }

    public String getM212() {
        return M212;
    }

    public void setM212(String m212) {
        M212 = m212;
    }

    public String getM213() {
        return M213;
    }

    public void setM213(String m213) {
        M213 = m213;
    }

    public String getM214() {
        return M214;
    }

    public void setM214(String m214) {
        M214 = m214;
    }

    public String getM215() {
        return M215;
    }

    public void setM215(String m215) {
        M215 = m215;
    }

    public String getM216() {
        return M216;
    }

    public void setM216(String m216) {
        M216 = m216;
    }

    public String getM217() {
        return M217;
    }

    public void setM217(String m217) {
        M217 = m217;
    }

    public String getM218() {
        return M218;
    }

    public void setM218(String m218) {
        M218 = m218;
    }

    public String getM220() {
        return M220;
    }

    public void setM220(String m220) {
        M220 = m220;
    }

    public String getM221() {
        return M221;
    }

    public void setM221(String m221) {
        M221 = m221;
    }

    public String getM222() {
        return M222;
    }

    public void setM222(String m222) {
        M222 = m222;
    }

    public String getM223() {
        return M223;
    }

    public void setM223(String m223) {
        M223 = m223;
    }

    public String getM224() {
        return M224;
    }

    public void setM224(String m224) {
        M224 = m224;
    }

    public String getM225() {
        return M225;
    }

    public void setM225(String m225) {
        M225 = m225;
    }

    public String getM226() {
        return M226;
    }

    public void setM226(String m226) {
        M226 = m226;
    }

    public String getM227() {
        return M227;
    }

    public void setM227(String m227) {
        M227 = m227;
    }

    public String getM228() {
        return M228;
    }

    public void setM228(String m228) {
        M228 = m228;
    }

    public String getM229() {
        return M229;
    }

    public void setM229(String m229) {
        M229 = m229;
    }

    public String getM230() {
        return M230;
    }

    public void setM230(String m230) {
        M230 = m230;
    }

    public String getM231() {
        return M231;
    }

    public void setM231(String m231) {
        M231 = m231;
    }

    public String getM232() {
        return M232;
    }

    public void setM232(String m232) {
        M232 = m232;
    }

    public String getM233() {
        return M233;
    }

    public void setM233(String m233) {
        M233 = m233;
    }

    public String getM236() {
        return M236;
    }

    public void setM236(String m236) {
        M236 = m236;
    }

    public String getM237() {
        return M237;
    }

    public void setM237(String m237) {
        M237 = m237;
    }

    public String getM238() {
        return M238;
    }

    public void setM238(String m238) {
        M238 = m238;
    }

    public String getM244() {
        return M244;
    }

    public void setM244(String m244) {
        M244 = m244;
    }

    public String getM245() {
        return M245;
    }

    public void setM245(String m245) {
        M245 = m245;
    }

    public String getM246() {
        return M246;
    }

    public void setM246(String m246) {
        M246 = m246;
    }

    public String getM247() {
        return M247;
    }

    public void setM247(String m247) {
        M247 = m247;
    }

    public String getM248() {
        return M248;
    }

    public void setM248(String m248) {
        M248 = m248;
    }

    public String getM249() {
        return M249;
    }

    public void setM249(String m249) {
        M249 = m249;
    }

    public String getM250() {
        return M250;
    }

    public void setM250(String m250) {
        M250 = m250;
    }

    public String getM251() {
        return M251;
    }

    public void setM251(String m251) {
        M251 = m251;
    }

    public String getM252() {
        return M252;
    }

    public void setM252(String m252) {
        M252 = m252;
    }

    public String getM253() {
        return M253;
    }

    public void setM253(String m253) {
        M253 = m253;
    }

    public String getM254() {
        return M254;
    }

    public void setM254(String m254) {
        M254 = m254;
    }

    public String getM255() {
        return M255;
    }

    public void setM255(String m255) {
        M255 = m255;
    }

    public String getM256() {
        return M256;
    }

    public void setM256(String m256) {
        M256 = m256;
    }

    public String getM257() {
        return M257;
    }

    public void setM257(String m257) {
        M257 = m257;
    }

    public String getM258() {
        return M258;
    }

    public void setM258(String m258) {
        M258 = m258;
    }

    public String getM259() {
        return M259;
    }

    public void setM259(String m259) {
        M259 = m259;
    }

    public String getM260() {
        return M260;
    }

    public void setM260(String m260) {
        M260 = m260;
    }

    public String getM261() {
        return M261;
    }

    public void setM261(String m261) {
        M261 = m261;
    }

    public String getM262() {
        return M262;
    }

    public void setM262(String m262) {
        M262 = m262;
    }

    public String getM263() {
        return M263;
    }

    public void setM263(String m263) {
        M263 = m263;
    }

    public String getM264() {
        return M264;
    }

    public void setM264(String m264) {
        M264 = m264;
    }

    public String getM267() {
        return M267;
    }

    public void setM267(String m267) {
        M267 = m267;
    }

    public String getM268() {
        return M268;
    }

    public void setM268(String m268) {
        M268 = m268;
    }

    public String getM269() {
        return M269;
    }

    public void setM269(String m269) {
        M269 = m269;
    }

    public String getM270() {
        return M270;
    }

    public void setM270(String m270) {
        M270 = m270;
    }

    public String getM271() {
        return M271;
    }

    public void setM271(String m271) {
        M271 = m271;
    }

    public String getM272() {
        return M272;
    }

    public void setM272(String m272) {
        M272 = m272;
    }

    public String getM273() {
        return M273;
    }

    public void setM273(String m273) {
        M273 = m273;
    }

    public String getM274() {
        return M274;
    }

    public void setM274(String m274) {
        M274 = m274;
    }

    public String getM276() {
        return M276;
    }

    public void setM276(String m276) {
        M276 = m276;
    }

    public String getM277() {
        return M277;
    }

    public void setM277(String m277) {
        M277 = m277;
    }

    public String getM278() {
        return M278;
    }

    public void setM278(String m278) {
        M278 = m278;
    }

    public String getM279() {
        return M279;
    }

    public void setM279(String m279) {
        M279 = m279;
    }

    public String getM280() {
        return M280;
    }

    public void setM280(String m280) {
        M280 = m280;
    }

    public String getM282() {
        return M282;
    }

    public void setM282(String m282) {
        M282 = m282;
    }

    public String getM283() {
        return M283;
    }

    public void setM283(String m283) {
        M283 = m283;
    }

    public String getM284() {
        return M284;
    }

    public void setM284(String m284) {
        M284 = m284;
    }

    public String getM285() {
        return M285;
    }

    public void setM285(String m285) {
        M285 = m285;
    }

    public String getM286() {
        return M286;
    }

    public void setM286(String m286) {
        M286 = m286;
    }

    public String getM287() {
        return M287;
    }

    public void setM287(String m287) {
        M287 = m287;
    }

    public String getM288() {
        return M288;
    }

    public void setM288(String m288) {
        M288 = m288;
    }

    public String getM289() {
        return M289;
    }

    public void setM289(String m289) {
        M289 = m289;
    }

    public String getM290() {
        return M290;
    }

    public void setM290(String m290) {
        M290 = m290;
    }

    public String getM291() {
        return M291;
    }

    public void setM291(String m291) {
        M291 = m291;
    }

    public String getM292() {
        return M292;
    }

    public void setM292(String m292) {
        M292 = m292;
    }

    public String getM293() {
        return M293;
    }

    public void setM293(String m293) {
        M293 = m293;
    }

    public String getM294() {
        return M294;
    }

    public void setM294(String m294) {
        M294 = m294;
    }

    public String getM295() {
        return M295;
    }

    public void setM295(String m295) {
        M295 = m295;
    }

    public String getM296() {
        return M296;
    }

    public void setM296(String m296) {
        M296 = m296;
    }

    public String getM297() {
        return M297;
    }

    public void setM297(String m297) {
        M297 = m297;
    }

    public String getM298() {
        return M298;
    }

    public void setM298(String m298) {
        M298 = m298;
    }

    public String getM299() {
        return M299;
    }

    public void setM299(String m299) {
        M299 = m299;
    }

    public String getM300() {
        return M300;
    }

    public void setM300(String m300) {
        M300 = m300;
    }

    public String getM301() {
        return M301;
    }

    public void setM301(String m301) {
        M301 = m301;
    }

    public String getM302() {
        return M302;
    }

    public void setM302(String m302) {
        M302 = m302;
    }

    public String getM303() {
        return M303;
    }

    public void setM303(String m303) {
        M303 = m303;
    }

    public String getM304() {
        return M304;
    }

    public void setM304(String m304) {
        M304 = m304;
    }

    public String getM305() {
        return M305;
    }

    public void setM305(String m305) {
        M305 = m305;
    }

    public String getM306() {
        return M306;
    }

    public void setM306(String m306) {
        M306 = m306;
    }

    public String getM310() {
        return M310;
    }

    public void setM310(String m310) {
        M310 = m310;
    }

    public String getQRCODE() {
        return QRCODE;
    }

    public void setQRCODE(String QRCODE) {
        this.QRCODE = QRCODE;
    }
}
