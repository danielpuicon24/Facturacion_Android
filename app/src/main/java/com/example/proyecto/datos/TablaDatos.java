package com.example.proyecto.datos;

public class TablaDatos {

    /*Creando las tablas de la base de datos*/

    //Tipos de documentos

    public static String tablaTipoDocumentoId =
            "create table tipoDocumentoId (codigo_td char(1) primary key, nombre varchar(50));";
    public static String tablaTipoDocumentoDatos[] = {
            "insert into tipoDocumentoId values('1','DNI');",
            "insert into tipoDocumentoId values('4','CE');",
            "insert into tipoDocumentoId values('6','RUC');",
            "insert into tipoDocumentoId values('7','Pasaporte');",
            "insert into tipoDocumentoId values('0','Doc.trib.no.dom.sin.ruc');"
    };

    //Países

    public static String tablaPais =
            "create table pais (codigo_pais char(2) primary key, nombre varchar(50), estado char(1));";
    public static String tablaPaisDatos[] = {
            "INSERT INTO `pais` (`codigo_pais`, `nombre`, `estado`) VALUES\n" +
                    "\t('PE', 'PERÚ', 1),\n" +
                    "\t('AX', 'AALAND ISLANDS', 1),\n" +
                    "\t('AF', 'AFGHANISTAN', 1),\n" +
                    "\t('AL', 'ALBANIA', 1),\n" +
                    "\t('DZ', 'ALGERIA', 1),\n" +
                    "\t('AS', 'AMERICAN SAMOA', 1),\n" +
                    "\t('AD', 'ANDORRA', 1),\n" +
                    "\t('AO', 'ANGOLA', 1),\n" +
                    "\t('AI', 'ANGUILLA', 1),\n" +
                    "\t('AQ', 'ANTARCTICA', 1),\n" +
                    "\t('AG', 'ANTIGUA AND BARBUDA', 1),\n" +
                    "\t('AR', 'ARGENTINA', 1),\n" +
                    "\t('AM', 'ARMENIA', 1),\n" +
                    "\t('AW', 'ARUBA', 1),\n" +
                    "\t('AU', 'AUSTRALIA', 1),\n" +
                    "\t('AT', 'AUSTRIA', 1),\n" +
                    "\t('AZ', 'AZERBAIJAN', 1),\n" +
                    "\t('BS', 'BAHAMAS', 1),\n" +
                    "\t('BH', 'BAHRAIN', 1),\n" +
                    "\t('BD', 'BANGLADESH', 1),\n" +
                    "\t('BB', 'BARBADOS', 1),\n" +
                    "\t('BY', 'BELARUS', 1),\n" +
                    "\t('BE', 'BELGIUM', 1),\n" +
                    "\t('BZ', 'BELIZE', 1),\n" +
                    "\t('BJ', 'BENIN', 1),\n" +
                    "\t('BM', 'BERMUDA', 1),\n" +
                    "\t('BT', 'BHUTAN', 1),\n" +
                    "\t('BO', 'BOLIVIA', 1),\n" +
                    "\t('BA', 'BOSNIA AND HERZEGOWINA', 1),\n" +
                    "\t('BW', 'BOTSWANA', 1),\n" +
                    "\t('BV', 'BOUVET ISLAND', 1),\n" +
                    "\t('BR', 'BRAZIL', 1),\n" +
                    "\t('IO', 'BRITISH INDIAN OCEAN TERRITORY', 1),\n" +
                    "\t('BN', 'BRUNEI DARUSSALAM', 1),\n" +
                    "\t('BG', 'BULGARIA', 1),\n" +
                    "\t('BF', 'BURKINA FASO', 1),\n" +
                    "\t('BI', 'BURUNDI', 1),\n" +
                    "\t('KH', 'CAMBODIA', 1),\n" +
                    "\t('CM', 'CAMEROON', 1),\n" +
                    "\t('CA', 'CANADA', 1),\n" +
                    "\t('CV', 'CAPE VERDE', 1),\n" +
                    "\t('KY', 'CAYMAN ISLANDS', 1),\n" +
                    "\t('CF', 'CENTRAL AFRICAN REPUBLIC', 1),\n" +
                    "\t('TD', 'CHAD', 1),\n" +
                    "\t('CL', 'CHILE', 1),\n" +
                    "\t('CN', 'CHINA', 1),\n" +
                    "\t('CX', 'CHRISTMAS ISLAND', 1),\n" +
                    "\t('CC', 'COCOS (KEELING) ISLANDS', 1),\n" +
                    "\t('CO', 'COLOMBIA', 1),\n" +
                    "\t('KM', 'COMOROS', 1),\n" +
                    "\t('CD', 'CONGO, Democratic Republic of (was Zaire)', 1),\n" +
                    "\t('CG', 'CONGO, Republic of', 1),\n" +
                    "\t('CK', 'COOK ISLANDS', 1),\n" +
                    "\t('CR', 'COSTA RICA', 1),\n" +
                    "\t('CI', 'COTE D`IVOIRE', 1),\n" +
                    "\t('HR', 'CROATIA (local name: Hrvatska)', 1),\n" +
                    "\t('CU', 'CUBA', 1),\n" +
                    "\t('CY', 'CYPRUS', 1),\n" +
                    "\t('CZ', 'CZECH REPUBLIC', 1),\n" +
                    "\t('DK', 'DENMARK', 1),\n" +
                    "\t('DJ', 'DJIBOUTI', 1),\n" +
                    "\t('DM', 'DOMINICA', 1),\n" +
                    "\t('DO', 'DOMINICAN REPUBLIC', 1),\n" +
                    "\t('EC', 'ECUADOR', 1),\n" +
                    "\t('EG', 'EGYPT', 1),\n" +
                    "\t('SV', 'EL SALVADOR', 1),\n" +
                    "\t('GQ', 'EQUATORIAL GUINEA', 1),\n" +
                    "\t('ER', 'ERITREA', 1),\n" +
                    "\t('EE', 'ESTONIA', 1),\n" +
                    "\t('ET', 'ETHIOPIA', 1),\n" +
                    "\t('FK', 'FALKLAND ISLANDS (MALVINAS)', 1),\n" +
                    "\t('FO', 'FAROE ISLANDS', 1),\n" +
                    "\t('FJ', 'FIJI', 1),\n" +
                    "\t('FI', 'FINLAND', 1),\n" +
                    "\t('FR', 'FRANCE', 1),\n" +
                    "\t('GF', 'FRENCH GUIANA', 1),\n" +
                    "\t('PF', 'FRENCH POLYNESIA', 1),\n" +
                    "\t('TF', 'FRENCH SOUTHERN TERRITORIES', 1),\n" +
                    "\t('GA', 'GABON', 1),\n" +
                    "\t('GM', 'GAMBIA', 1),\n" +
                    "\t('GE', 'GEORGIA', 1),\n" +
                    "\t('DE', 'GERMANY', 1),\n" +
                    "\t('GH', 'GHANA', 1),\n" +
                    "\t('GI', 'GIBRALTAR', 1),\n" +
                    "\t('GR', 'GREECE', 1),\n" +
                    "\t('GL', 'GREENLAND', 1),\n" +
                    "\t('GD', 'GRENADA', 1),\n" +
                    "\t('GP', 'GUADELOUPE', 1),\n" +
                    "\t('GU', 'GUAM', 1),\n" +
                    "\t('GT', 'GUATEMALA', 1),\n" +
                    "\t('GN', 'GUINEA', 1),\n" +
                    "\t('GW', 'GUINEA-BISSAU', 1),\n" +
                    "\t('GY', 'GUYANA', 1),\n" +
                    "\t('HT', 'HAITI', 1),\n" +
                    "\t('HM', 'HEARD AND MC DONALD ISLANDS', 1),\n" +
                    "\t('HN', 'HONDURAS', 1),\n" +
                    "\t('HK', 'HONG KONG', 1),\n" +
                    "\t('HU', 'HUNGARY', 1),\n" +
                    "\t('IS', 'ICELAND', 1),\n" +
                    "\t('IN', 'INDIA', 1),\n" +
                    "\t('ID', 'INDONESIA', 1),\n" +
                    "\t('IR', 'IRAN (ISLAMIC REPUBLIC OF)', 1),\n" +
                    "\t('IQ', 'IRAQ', 1),\n" +
                    "\t('IE', 'IRELAND', 1),\n" +
                    "\t('IL', 'ISRAEL', 1),\n" +
                    "\t('IT', 'ITALY', 1),\n" +
                    "\t('JM', 'JAMAICA', 1),\n" +
                    "\t('JP', 'JAPAN', 1),\n" +
                    "\t('JO', 'JORDAN', 1),\n" +
                    "\t('KZ', 'KAZAKHSTAN', 1),\n" +
                    "\t('KE', 'KENYA', 1),\n" +
                    "\t('KI', 'KIRIBATI', 1),\n" +
                    "\t('KP', 'KOREA, DEMOCRATIC PEOPLE`S REPUBLIC OF', 1),\n" +
                    "\t('KR', 'KOREA, REPUBLIC OF', 1),\n" +
                    "\t('KW', 'KUWAIT', 1),\n" +
                    "\t('KG', 'KYRGYZSTAN', 1),\n" +
                    "\t('LA', 'LAO PEOPLE`S DEMOCRATIC REPUBLIC', 1),\n" +
                    "\t('LV', 'LATVIA', 1),\n" +
                    "\t('LB', 'LEBANON', 1),\n" +
                    "\t('LS', 'LESOTHO', 1),\n" +
                    "\t('LR', 'LIBERIA', 1),\n" +
                    "\t('LY', 'LIBYAN ARAB JAMAHIRIYA', 1),\n" +
                    "\t('LI', 'LIECHTENSTEIN', 1),\n" +
                    "\t('LT', 'LITHUANIA', 1),\n" +
                    "\t('LU', 'LUXEMBOURG', 1),\n" +
                    "\t('MO', 'MACAU', 1),\n" +
                    "\t('MK', 'MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF', 1),\n" +
                    "\t('MG', 'MADAGASCAR', 1),\n" +
                    "\t('MW', 'MALAWI', 1),\n" +
                    "\t('MY', 'MALAYSIA', 1),\n" +
                    "\t('MV', 'MALDIVES', 1),\n" +
                    "\t('ML', 'MALI', 1),\n" +
                    "\t('MT', 'MALTA', 1),\n" +
                    "\t('MH', 'MARSHALL ISLANDS', 1),\n" +
                    "\t('MQ', 'MARTINIQUE', 1),\n" +
                    "\t('MR', 'MAURITANIA', 1),\n" +
                    "\t('MU', 'MAURITIUS', 1),\n" +
                    "\t('YT', 'MAYOTTE', 1),\n" +
                    "\t('MX', 'MEXICO', 1),\n" +
                    "\t('FM', 'MICRONESIA, FEDERATED STATES OF', 1),\n" +
                    "\t('MD', 'MOLDOVA, REPUBLIC OF', 1),\n" +
                    "\t('MC', 'MONACO', 1),\n" +
                    "\t('MN', 'MONGOLIA', 1),\n" +
                    "\t('MS', 'MONTSERRAT', 1),\n" +
                    "\t('MA', 'MOROCCO', 1),\n" +
                    "\t('MZ', 'MOZAMBIQUE', 1),\n" +
                    "\t('MM', 'MYANMAR', 1),\n" +
                    "\t('NA', 'NAMIBIA', 1),\n" +
                    "\t('NR', 'NAURU', 1),\n" +
                    "\t('NP', 'NEPAL', 1),\n" +
                    "\t('NL', 'NETHERLANDS', 1),\n" +
                    "\t('AN', 'NETHERLANDS ANTILLES', 1),\n" +
                    "\t('NC', 'NEW CALEDONIA', 1),\n" +
                    "\t('NZ', 'NEW ZEALAND', 1),\n" +
                    "\t('NI', 'NICARAGUA', 1),\n" +
                    "\t('NE', 'NIGER', 1),\n" +
                    "\t('NG', 'NIGERIA', 1),\n" +
                    "\t('NU', 'NIUE', 1),\n" +
                    "\t('NF', 'NORFOLK ISLAND', 1),\n" +
                    "\t('MP', 'NORTHERN MARIANA ISLANDS', 1),\n" +
                    "\t('NO', 'NORWAY', 1),\n" +
                    "\t('OM', 'OMAN', 1),\n" +
                    "\t('PK', 'PAKISTAN', 1),\n" +
                    "\t('PW', 'PALAU', 1),\n" +
                    "\t('PS', 'PALESTINIAN TERRITORY, Occupied', 1),\n" +
                    "\t('PA', 'PANAMA', 1),\n" +
                    "\t('PG', 'PAPUA NEW GUINEA', 1),\n" +
                    "\t('PY', 'PARAGUAY', 1),\n" +
                    "\t('PH', 'PHILIPPINES', 1),\n" +
                    "\t('PN', 'PITCAIRN', 1),\n" +
                    "\t('PL', 'POLAND', 1),\n" +
                    "\t('PT', 'PORTUGAL', 1),\n" +
                    "\t('PR', 'PUERTO RICO', 1),\n" +
                    "\t('QA', 'QATAR', 1),\n" +
                    "\t('RE', 'REUNION', 1),\n" +
                    "\t('RO', 'ROMANIA', 1),\n" +
                    "\t('RU', 'RUSSIAN FEDERATION', 1),\n" +
                    "\t('RW', 'RWANDA', 1),\n" +
                    "\t('SH', 'SAINT HELENA', 1),\n" +
                    "\t('KN', 'SAINT KITTS AND NEVIS', 1),\n" +
                    "\t('LC', 'SAINT LUCIA', 1),\n" +
                    "\t('PM', 'SAINT PIERRE AND MIQUELON', 1),\n" +
                    "\t('VC', 'SAINT VINCENT AND THE GRENADINES', 1),\n" +
                    "\t('WS', 'SAMOA', 1),\n" +
                    "\t('SM', 'SAN MARINO', 1),\n" +
                    "\t('ST', 'SAO TOME AND PRINCIPE', 1),\n" +
                    "\t('SA', 'SAUDI ARABIA', 1),\n" +
                    "\t('SN', 'SENEGAL', 1),\n" +
                    "\t('CS', 'SERBIA AND MONTENEGRO', 1),\n" +
                    "\t('SC', 'SEYCHELLES', 1),\n" +
                    "\t('SL', 'SIERRA LEONE', 1),\n" +
                    "\t('SG', 'SINGAPORE', 1),\n" +
                    "\t('SK', 'SLOVAKIA', 1),\n" +
                    "\t('SI', 'SLOVENIA', 1),\n" +
                    "\t('SB', 'SOLOMON ISLANDS', 1),\n" +
                    "\t('SO', 'SOMALIA', 1),\n" +
                    "\t('ZA', 'SOUTH AFRICA', 1),\n" +
                    "\t('GS', 'SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS', 1),\n" +
                    "\t('ES', 'SPAIN', 1),\n" +
                    "\t('LK', 'SRI LANKA', 1),\n" +
                    "\t('SD', 'SUDAN', 1),\n" +
                    "\t('SR', 'SURINAME', 1),\n" +
                    "\t('SJ', 'SVALBARD AND JAN MAYEN ISLANDS', 1),\n" +
                    "\t('SZ', 'SWAZILAND', 1),\n" +
                    "\t('SE', 'SWEDEN', 1),\n" +
                    "\t('CH', 'SWITZERLAND', 1),\n" +
                    "\t('SY', 'SYRIAN ARAB REPUBLIC', 1),\n" +
                    "\t('TW', 'TAIWAN', 1),\n" +
                    "\t('TJ', 'TAJIKISTAN', 1),\n" +
                    "\t('TZ', 'TANZANIA, UNITED REPUBLIC OF', 1),\n" +
                    "\t('TH', 'THAILAND', 1),\n" +
                    "\t('TL', 'TIMOR-LESTE', 1),\n" +
                    "\t('TG', 'TOGO', 1),\n" +
                    "\t('TK', 'TOKELAU', 1),\n" +
                    "\t('TO', 'TONGA', 1),\n" +
                    "\t('TT', 'TRINIDAD AND TOBAGO', 1),\n" +
                    "\t('TN', 'TUNISIA', 1),\n" +
                    "\t('TR', 'TURKEY', 1),\n" +
                    "\t('TM', 'TURKMENISTAN', 1),\n" +
                    "\t('TC', 'TURKS AND CAICOS ISLANDS', 1),\n" +
                    "\t('TV', 'TUVALU', 1),\n" +
                    "\t('UG', 'UGANDA', 1),\n" +
                    "\t('UA', 'UKRAINE', 1),\n" +
                    "\t('AE', 'UNITED ARAB EMIRATES', 1),\n" +
                    "\t('GB', 'UNITED KINGDOM', 1),\n" +
                    "\t('US', 'UNITED STATES', 1),\n" +
                    "\t('UM', 'UNITED STATES MINOR OUTLYING ISLANDS', 1),\n" +
                    "\t('UY', 'URUGUAY', 1),\n" +
                    "\t('UZ', 'UZBEKISTAN', 1),\n" +
                    "\t('VU', 'VANUATU', 1),\n" +
                    "\t('VA', 'VATICAN CITY STATE (HOLY SEE)', 1),\n" +
                    "\t('VE', 'VENEZUELA', 1),\n" +
                    "\t('VN', 'VIET NAM', 1),\n" +
                    "\t('VG', 'VIRGIN ISLANDS (BRITISH)', 1),\n" +
                    "\t('VI', 'VIRGIN ISLANDS (U.S.)', 1),\n" +
                    "\t('WF', 'WALLIS AND FUTUNA ISLANDS', 1),\n" +
                    "\t('EH', 'WESTERN SAHARA', 1),\n" +
                    "\t('YE', 'YEMEN', 1),\n" +
                    "\t('ZM', 'ZAMBIA', 1),\n" +
                    "\t('ZW', 'ZIMBABWE', 1);"
    };


    //Depto
    public static String tablaDepartamento =
            "create table departamento(codigo_departamento char(2) primary key, nombre varchar(50), estado char(1));";
    public static String tablaDepartamentoDatos[] = {
            "INSERT INTO `departamento` (`codigo_departamento`, `nombre`, `estado`) VALUES\n" +
                    "\t('01', 'AMAZONAS', 1),\n" +
                    "\t('02', 'ÁNCASH', 1),\n" +
                    "\t('03', 'APURIMAC', 1),\n" +
                    "\t('04', 'AREQUIPA', 1),\n" +
                    "\t('05', 'AYACUCHO', 1),\n" +
                    "\t('06', 'CAJAMARCA', 1),\n" +
                    "\t('07', 'CALLAO', 1),\n" +
                    "\t('08', 'CUSCO', 1),\n" +
                    "\t('09', 'HUANCAVELICA', 1),\n" +
                    "\t('10', 'HUÁNUCO', 1),\n" +
                    "\t('11', 'ICA', 1),\n" +
                    "\t('12', 'JUNÍN', 1),\n" +
                    "\t('13', 'LA LIBERTAD', 1),\n" +
                    "\t('14', 'LAMBAYEQUE', 1),\n" +
                    "\t('15', 'LIMA', 1),\n" +
                    "\t('16', 'LORETO', 1),\n" +
                    "\t('17', 'MADRE DE DIOS', 1),\n" +
                    "\t('18', 'MOQUEGUA', 1),\n" +
                    "\t('19', 'PASCO', 1),\n" +
                    "\t('20', 'PIURA', 1),\n" +
                    "\t('21', 'PUNO', 1),\n" +
                    "\t('22', 'SAN MARTIN', 1),\n" +
                    "\t('23', 'TACNA', 1),\n" +
                    "\t('24', 'TUMBES', 1),\n" +
                    "\t('25', 'UCAYALI', 1);"
    };
    /*
    public static String tablaDepartamento =
            "create table departamento(codigo_departamento char(2) primary key, nombre varchar(50));";
    //constraint pk_provincia primary key(codigo_departamento, codigo_provincia) ,foreign key(codigo_departamento) references departamento(codigo_departamento));";
    public static String tablaDepartamentoDatos[] = {
            "insert into departamento values('01', 'AMAZONAS');",
            "insert into departamento values('02','ANCASH');",
            "insert into departamento values('03','APURIMAC');",
            "insert into departamento values('04','AREQUIPA');",
            "insert into departamento values('05','AYACUCHO');",
            "insert into departamento values('06','CAJAMARCA');",
            "insert into departamento values('07','CUSCO');",
            "insert into departamento values('08','HUANCAVELICA');",
            "insert into departamento values('09','HUANUCO');",
            "insert into departamento values('10','ICA');",
            "insert into departamento values('11','JUNIN');",
            "insert into departamento values('12','LA LIBERTAD');",
            "insert into departamento values('13','LAMBAYEQUE');",
            "insert into departamento values('14','LIMA');",
            "insert into departamento values('15','LORETO');",
            "insert into departamento values('16','MADRE DE DIOS');",
            "insert into departamento values('17','MOQUEGUA');",
            "insert into departamento values('18','PASCO');",
            "insert into departamento values('19','PIURA');",
            "insert into departamento values('20','PUNO');",
            "insert into departamento values('21','SAN MARTIN');",
            "insert into departamento values('22','TACNA');",
            "insert into departamento values('23','TUMBES');",
            "insert into departamento values('24','UCAYALI');"
    };*/

    /*
    quité el pk de cog deto
    primary key(codigo_departamento, codigo_provincia)
     */
    public static String tablaProvincia =
            "create table provincia(codigo_provincia char(4),codigo_departamento char(2),  nombre varchar(50), estado char (1), constraint pk_provincia primary key( codigo_provincia) ,foreign key(codigo_departamento) references departamento(codigo_departamento));";
    public static String tablaProvinciaDatos[] =
            {
                    "INSERT INTO `provincia` (`codigo_provincia`, `codigo_departamento`, `nombre`, `estado`) VALUES\n" +
                            "\t('0101', '01', 'Chachapoyas', 1),\n" +
                            "\t('0102', '01', 'Bagua', 1),\n" +
                            "\t('0103', '01', 'Bongará', 1),\n" +
                            "\t('0104', '01', 'Condorcanqui', 1),\n" +
                            "\t('0105', '01', 'Luya', 1),\n" +
                            "\t('0106', '01', 'Rodríguez de Mendoza', 1),\n" +
                            "\t('0107', '01', 'Utcubamba', 1),\n" +
                            "\t('0201', '02', 'Huaraz', 1),\n" +
                            "\t('0202', '02', 'Aija', 1),\n" +
                            "\t('0203', '02', 'Antonio Raymondi', 1),\n" +
                            "\t('0204', '02', 'Asunción', 1),\n" +
                            "\t('0205', '02', 'Bolognesi', 1),\n" +
                            "\t('0206', '02', 'Carhuaz', 1),\n" +
                            "\t('0207', '02', 'Carlos Fermín Fitzcarrald', 1),\n" +
                            "\t('0208', '02', 'Casma', 1),\n" +
                            "\t('0209', '02', 'Corongo', 1),\n" +
                            "\t('0210', '02', 'Huari', 1),\n" +
                            "\t('0211', '02', 'Huarmey', 1),\n" +
                            "\t('0212', '02', 'Huaylas', 1),\n" +
                            "\t('0213', '02', 'Mariscal Luzuriaga', 1),\n" +
                            "\t('0214', '02', 'Ocros', 1),\n" +
                            "\t('0215', '02', 'Pallasca', 1),\n" +
                            "\t('0216', '02', 'Pomabamba', 1),\n" +
                            "\t('0217', '02', 'Recuay', 1),\n" +
                            "\t('0218', '02', 'Santa', 1),\n" +
                            "\t('0219', '02', 'Sihuas', 1),\n" +
                            "\t('0220', '02', 'Yungay', 1),\n" +
                            "\t('0301', '03', 'Abancay', 1),\n" +
                            "\t('0302', '03', 'Andahuaylas', 1),\n" +
                            "\t('0303', '03', 'Antabamba', 1),\n" +
                            "\t('0304', '03', 'Aymaraes', 1),\n" +
                            "\t('0305', '03', 'Cotabambas', 1),\n" +
                            "\t('0306', '03', 'Chincheros', 1),\n" +
                            "\t('0307', '03', 'Grau', 1),\n" +
                            "\t('0401', '04', 'Arequipa', 1),\n" +
                            "\t('0402', '04', 'Camaná', 1),\n" +
                            "\t('0403', '04', 'Caravelí', 1),\n" +
                            "\t('0404', '04', 'Castilla', 1),\n" +
                            "\t('0405', '04', 'Caylloma', 1),\n" +
                            "\t('0406', '04', 'Condesuyos', 1),\n" +
                            "\t('0407', '04', 'Islay', 1),\n" +
                            "\t('0408', '04', 'La Uniòn', 1),\n" +
                            "\t('0501', '05', 'Huamanga', 1),\n" +
                            "\t('0502', '05', 'Cangallo', 1),\n" +
                            "\t('0503', '05', 'Huanca Sancos', 1),\n" +
                            "\t('0504', '05', 'Huanta', 1),\n" +
                            "\t('0505', '05', 'La Mar', 1),\n" +
                            "\t('0506', '05', 'Lucanas', 1),\n" +
                            "\t('0507', '05', 'Parinacochas', 1),\n" +
                            "\t('0508', '05', 'Pàucar del Sara Sara', 1),\n" +
                            "\t('0509', '05', 'Sucre', 1),\n" +
                            "\t('0510', '05', 'Víctor Fajardo', 1),\n" +
                            "\t('0511', '05', 'Vilcas Huamán', 1),\n" +
                            "\t('0601', '06', 'Cajamarca', 1),\n" +
                            "\t('0602', '06', 'Cajabamba', 1),\n" +
                            "\t('0603', '06', 'Celendín', 1),\n" +
                            "\t('0604', '06', 'Chota', 1),\n" +
                            "\t('0605', '06', 'Contumazá', 1),\n" +
                            "\t('0606', '06', 'Cutervo', 1),\n" +
                            "\t('0607', '06', 'Hualgayoc', 1),\n" +
                            "\t('0608', '06', 'Jaén', 1),\n" +
                            "\t('0609', '06', 'San Ignacio', 1),\n" +
                            "\t('0610', '06', 'San Marcos', 1),\n" +
                            "\t('0611', '06', 'San Miguel', 1),\n" +
                            "\t('0612', '06', 'San Pablo', 1),\n" +
                            "\t('0613', '06', 'Santa Cruz', 1),\n" +
                            "\t('0701', '07', 'Prov. Const. del Callao', 1),\n" +
                            "\t('0801', '08', 'Cusco', 1),\n" +
                            "\t('0802', '08', 'Acomayo', 1),\n" +
                            "\t('0803', '08', 'Anta', 1),\n" +
                            "\t('0804', '08', 'Calca', 1),\n" +
                            "\t('0805', '08', 'Canas', 1),\n" +
                            "\t('0806', '08', 'Canchis', 1),\n" +
                            "\t('0807', '08', 'Chumbivilcas', 1),\n" +
                            "\t('0808', '08', 'Espinar', 1),\n" +
                            "\t('0809', '08', 'La Convención', 1),\n" +
                            "\t('0810', '08', 'Paruro', 1),\n" +
                            "\t('0811', '08', 'Paucartambo', 1),\n" +
                            "\t('0812', '08', 'Quispicanchi', 1),\n" +
                            "\t('0813', '08', 'Urubamba', 1),\n" +
                            "\t('0901', '09', 'Huancavelica', 1),\n" +
                            "\t('0902', '09', 'Acobamba', 1),\n" +
                            "\t('0903', '09', 'Angaraes', 1),\n" +
                            "\t('0904', '09', 'Castrovirreyna', 1),\n" +
                            "\t('0905', '09', 'Churcampa', 1),\n" +
                            "\t('0906', '09', 'Huaytará', 1),\n" +
                            "\t('0907', '09', 'Tayacaja', 1),\n" +
                            "\t('1001', '10', 'Huánuco', 1),\n" +
                            "\t('1002', '10', 'Ambo', 1),\n" +
                            "\t('1003', '10', 'Dos de Mayo', 1),\n" +
                            "\t('1004', '10', 'Huacaybamba', 1),\n" +
                            "\t('1005', '10', 'Huamalíes', 1),\n" +
                            "\t('1006', '10', 'Leoncio Prado', 1),\n" +
                            "\t('1007', '10', 'Marañón', 1),\n" +
                            "\t('1008', '10', 'Pachitea', 1),\n" +
                            "\t('1009', '10', 'Puerto Inca', 1),\n" +
                            "\t('1010', '10', 'Lauricocha', 1),\n" +
                            "\t('1011', '10', 'Yarowilca', 1),\n" +
                            "\t('1101', '11', 'Ica', 1),\n" +
                            "\t('1102', '11', 'Chincha', 1),\n" +
                            "\t('1103', '11', 'Nasca', 1),\n" +
                            "\t('1104', '11', 'Palpa', 1),\n" +
                            "\t('1105', '11', 'Pisco', 1),\n" +
                            "\t('1201', '12', 'Huancayo', 1),\n" +
                            "\t('1202', '12', 'Concepción', 1),\n" +
                            "\t('1203', '12', 'Chanchamayo', 1),\n" +
                            "\t('1204', '12', 'Jauja', 1),\n" +
                            "\t('1205', '12', 'Junín', 1),\n" +
                            "\t('1206', '12', 'Satipo', 1),\n" +
                            "\t('1207', '12', 'Tarma', 1),\n" +
                            "\t('1208', '12', 'Yauli', 1),\n" +
                            "\t('1209', '12', 'Chupaca', 1),\n" +
                            "\t('1301', '13', 'Trujillo', 1),\n" +
                            "\t('1302', '13', 'Ascope', 1),\n" +
                            "\t('1303', '13', 'Bolívar', 1),\n" +
                            "\t('1304', '13', 'Chepén', 1),\n" +
                            "\t('1305', '13', 'Julcán', 1),\n" +
                            "\t('1306', '13', 'Otuzco', 1),\n" +
                            "\t('1307', '13', 'Pacasmayo', 1),\n" +
                            "\t('1308', '13', 'Pataz', 1),\n" +
                            "\t('1309', '13', 'Sánchez Carrión', 1),\n" +
                            "\t('1310', '13', 'Santiago de Chuco', 1),\n" +
                            "\t('1311', '13', 'Gran Chimú', 1),\n" +
                            "\t('1312', '13', 'Virú', 1),\n" +
                            "\t('1401', '14', 'Chiclayo', 1),\n" +
                            "\t('1402', '14', 'Ferreñafe', 1),\n" +
                            "\t('1403', '14', 'Lambayeque', 1),\n" +
                            "\t('1501', '15', 'Lima', 1),\n" +
                            "\t('1502', '15', 'Barranca', 1),\n" +
                            "\t('1503', '15', 'Cajatambo', 1),\n" +
                            "\t('1504', '15', 'Canta', 1),\n" +
                            "\t('1505', '15', 'Cañete', 1),\n" +
                            "\t('1506', '15', 'Huaral', 1),\n" +
                            "\t('1507', '15', 'Huarochirí', 1),\n" +
                            "\t('1508', '15', 'Huaura', 1),\n" +
                            "\t('1509', '15', 'Oyón', 1),\n" +
                            "\t('1510', '15', 'Yauyos', 1),\n" +
                            "\t('1601', '16', 'Maynas', 1),\n" +
                            "\t('1602', '16', 'Alto Amazonas', 1),\n" +
                            "\t('1603', '16', 'Loreto', 1),\n" +
                            "\t('1604', '16', 'Mariscal Ramón Castilla', 1),\n" +
                            "\t('1605', '16', 'Requena', 1),\n" +
                            "\t('1606', '16', 'Ucayali', 1),\n" +
                            "\t('1607', '16', 'Datem del Marañón', 1),\n" +
                            "\t('1608', '16', 'Putumayo', 1),\n" +
                            "\t('1701', '17', 'Tambopata', 1),\n" +
                            "\t('1702', '17', 'Manu', 1),\n" +
                            "\t('1703', '17', 'Tahuamanu', 1),\n" +
                            "\t('1801', '18', 'Mariscal Nieto', 1),\n" +
                            "\t('1802', '18', 'General Sánchez Cerro', 1),\n" +
                            "\t('1803', '18', 'Ilo', 1),\n" +
                            "\t('1901', '19', 'Pasco', 1),\n" +
                            "\t('1902', '19', 'Daniel Alcides Carrión', 1),\n" +
                            "\t('1903', '19', 'Oxapampa', 1),\n" +
                            "\t('2001', '20', 'Piura', 1),\n" +
                            "\t('2002', '20', 'Ayabaca', 1),\n" +
                            "\t('2003', '20', 'Huancabamba', 1),\n" +
                            "\t('2004', '20', 'Morropón', 1),\n" +
                            "\t('2005', '20', 'Paita', 1),\n" +
                            "\t('2006', '20', 'Sullana', 1),\n" +
                            "\t('2007', '20', 'Talara', 1),\n" +
                            "\t('2008', '20', 'Sechura', 1),\n" +
                            "\t('2101', '21', 'Puno', 1),\n" +
                            "\t('2102', '21', 'Azángaro', 1),\n" +
                            "\t('2103', '21', 'Carabaya', 1),\n" +
                            "\t('2104', '21', 'Chucuito', 1),\n" +
                            "\t('2105', '21', 'El Collao', 1),\n" +
                            "\t('2106', '21', 'Huancané', 1),\n" +
                            "\t('2107', '21', 'Lampa', 1),\n" +
                            "\t('2108', '21', 'Melgar', 1),\n" +
                            "\t('2109', '21', 'Moho', 1),\n" +
                            "\t('2110', '21', 'San Antonio de Putina', 1),\n" +
                            "\t('2111', '21', 'San Román', 1),\n" +
                            "\t('2112', '21', 'Sandia', 1),\n" +
                            "\t('2113', '21', 'Yunguyo', 1),\n" +
                            "\t('2201', '22', 'Moyobamba', 1),\n" +
                            "\t('2202', '22', 'Bellavista', 1),\n" +
                            "\t('2203', '22', 'El Dorado', 1),\n" +
                            "\t('2204', '22', 'Huallaga', 1),\n" +
                            "\t('2205', '22', 'Lamas', 1),\n" +
                            "\t('2206', '22', 'Mariscal Cáceres', 1),\n" +
                            "\t('2207', '22', 'Picota', 1),\n" +
                            "\t('2208', '22', 'Rioja', 1),\n" +
                            "\t('2209', '22', 'San Martín', 1),\n" +
                            "\t('2210', '22', 'Tocache', 1),\n" +
                            "\t('2301', '23', 'Tacna', 1),\n" +
                            "\t('2302', '23', 'Candarave', 1),\n" +
                            "\t('2303', '23', 'Jorge Basadre', 1),\n" +
                            "\t('2304', '23', 'Tarata', 1),\n" +
                            "\t('2401', '24', 'Tumbes', 1),\n" +
                            "\t('2402', '24', 'Contralmirante Villar', 1),\n" +
                            "\t('2403', '24', 'Zarumilla', 1),\n" +
                            "\t('2501', '25', 'Coronel Portillo', 1),\n" +
                            "\t('2502', '25', 'Atalaya', 1),\n" +
                            "\t('2503', '25', 'Padre Abad', 1),\n" +
                            "\t('2504', '25', 'Purús', 1);"

            };



    public static String tablaDistrito =
            "create table distrito(codigo_distrito char(6),codigo_provincia char(4),  nombre varchar(50), estado char(1),constraint pk_distrito primary key( codigo_provincia, codigo_distrito),foreign key(codigo_provincia) references provincia(codigo_provincia));";

    public static String tablaDistritoDatos1[] =
            {
                    "INSERT INTO `distrito` (`codigo_distrito`, `codigo_provincia`, `nombre`, `estado`) VALUES\n" +
                            "\t('120101', '1201', 'Huancayo', 1),\n" +
                            "\t('120104', '1201', 'Carhuacallanga', 1),\n" +
                            "\t('120105', '1201', 'Chacapampa', 1),\n" +
                            "\t('120106', '1201', 'Chicche', 1),\n" +
                            "\t('120107', '1201', 'Chilca', 1),\n" +
                            "\t('120108', '1201', 'Chongos Alto', 1),\n" +
                            "\t('120111', '1201', 'Chupuro', 1),\n" +
                            "\t('120112', '1201', 'Colca', 1),\n" +
                            "\t('120113', '1201', 'Cullhuas', 1),\n" +
                            "\t('120114', '1201', 'El Tambo', 1),\n" +
                            "\t('120116', '1201', 'Huacrapuquio', 1),\n" +
                            "\t('120117', '1201', 'Hualhuas', 1),\n" +
                            "\t('120119', '1201', 'Huancan', 1),\n" +
                            "\t('120120', '1201', 'Huasicancha', 1),\n" +
                            "\t('120121', '1201', 'Huayucachi', 1),\n" +
                            "\t('120122', '1201', 'Ingenio', 1),\n" +
                            "\t('120124', '1201', 'Pariahuanca', 1),\n" +
                            "\t('120125', '1201', 'Pilcomayo', 1),\n" +
                            "\t('120126', '1201', 'Pucara', 1),\n" +
                            "\t('120127', '1201', 'Quichuay', 1),\n" +
                            "\t('120128', '1201', 'Quilcas', 1),\n" +
                            "\t('120129', '1201', 'San Agustín', 1),\n" +
                            "\t('120130', '1201', 'San Jerónimo de Tunan', 1),\n" +
                            "\t('120132', '1201', 'Saño', 1),\n" +
                            "\t('120133', '1201', 'Sapallanga', 1),\n" +
                            "\t('120134', '1201', 'Sicaya', 1),\n" +
                            "\t('120135', '1201', 'Santo Domingo de Acobamba', 1),\n" +
                            "\t('120136', '1201', 'Viques', 1),\n" +
                            "\t('120201', '1202', 'Concepción', 1),\n" +
                            "\t('120202', '1202', 'Aco', 1),\n" +
                            "\t('120203', '1202', 'Andamarca', 1),\n" +
                            "\t('120204', '1202', 'Chambara', 1),\n" +
                            "\t('120205', '1202', 'Cochas', 1),\n" +
                            "\t('120206', '1202', 'Comas', 1),\n" +
                            "\t('120207', '1202', 'Heroínas Toledo', 1),\n" +
                            "\t('120208', '1202', 'Manzanares', 1),\n" +
                            "\t('120209', '1202', 'Mariscal Castilla', 1),\n" +
                            "\t('120210', '1202', 'Matahuasi', 1),\n" +
                            "\t('120211', '1202', 'Mito', 1),\n" +
                            "\t('120212', '1202', 'Nueve de Julio', 1),\n" +
                            "\t('120213', '1202', 'Orcotuna', 1),\n" +
                            "\t('120214', '1202', 'San José de Quero', 1),\n" +
                            "\t('120215', '1202', 'Santa Rosa de Ocopa', 1),\n" +
                            "\t('120301', '1203', 'Chanchamayo', 1),\n" +
                            "\t('120302', '1203', 'Perene', 1),\n" +
                            "\t('120303', '1203', 'Pichanaqui', 1),\n" +
                            "\t('120304', '1203', 'San Luis de Shuaro', 1),\n" +
                            "\t('120305', '1203', 'San Ramón', 1),\n" +
                            "\t('120306', '1203', 'Vitoc', 1),\n" +
                            "\t('120401', '1204', 'Jauja', 1),\n" +
                            "\t('120402', '1204', 'Acolla', 1),\n" +
                            "\t('120403', '1204', 'Apata', 1),\n" +
                            "\t('120404', '1204', 'Ataura', 1),\n" +
                            "\t('120405', '1204', 'Canchayllo', 1),\n" +
                            "\t('120406', '1204', 'Curicaca', 1),\n" +
                            "\t('120407', '1204', 'El Mantaro', 1),\n" +
                            "\t('120408', '1204', 'Huamali', 1),\n" +
                            "\t('120409', '1204', 'Huaripampa', 1),\n" +
                            "\t('120410', '1204', 'Huertas', 1),\n" +
                            "\t('120411', '1204', 'Janjaillo', 1),\n" +
                            "\t('120412', '1204', 'Julcán', 1),\n" +
                            "\t('120413', '1204', 'Leonor Ordóñez', 1),\n" +
                            "\t('120414', '1204', 'Llocllapampa', 1),\n" +
                            "\t('120415', '1204', 'Marco', 1),\n" +
                            "\t('120416', '1204', 'Masma', 1),\n" +
                            "\t('120417', '1204', 'Masma Chicche', 1),\n" +
                            "\t('120418', '1204', 'Molinos', 1),\n" +
                            "\t('120419', '1204', 'Monobamba', 1),\n" +
                            "\t('120420', '1204', 'Muqui', 1),\n" +
                            "\t('120421', '1204', 'Muquiyauyo', 1),\n" +
                            "\t('120422', '1204', 'Paca', 1),\n" +
                            "\t('120423', '1204', 'Paccha', 1),\n" +
                            "\t('120424', '1204', 'Pancan', 1),\n" +
                            "\t('120425', '1204', 'Parco', 1),\n" +
                            "\t('120426', '1204', 'Pomacancha', 1),\n" +
                            "\t('120427', '1204', 'Ricran', 1),\n" +
                            "\t('120428', '1204', 'San Lorenzo', 1),\n" +
                            "\t('120429', '1204', 'San Pedro de Chunan', 1),\n" +
                            "\t('120430', '1204', 'Sausa', 1),\n" +
                            "\t('120431', '1204', 'Sincos', 1),\n" +
                            "\t('120432', '1204', 'Tunan Marca', 1),\n" +
                            "\t('120433', '1204', 'Yauli', 1),\n" +
                            "\t('120434', '1204', 'Yauyos', 1),\n" +
                            "\t('120501', '1205', 'Junin', 1),\n" +
                            "\t('120502', '1205', 'Carhuamayo', 1),\n" +
                            "\t('120503', '1205', 'Ondores', 1),\n" +
                            "\t('120504', '1205', 'Ulcumayo', 1),\n" +
                            "\t('120601', '1206', 'Satipo', 1),\n" +
                            "\t('120602', '1206', 'Coviriali', 1),\n" +
                            "\t('120603', '1206', 'Llaylla', 1),\n" +
                            "\t('120604', '1206', 'Mazamari', 1),\n" +
                            "\t('120605', '1206', 'Pampa Hermosa', 1),\n" +
                            "\t('120606', '1206', 'Pangoa', 1),\n" +
                            "\t('120607', '1206', 'Río Negro', 1),\n" +
                            "\t('120608', '1206', 'Río Tambo', 1),\n" +
                            "\t('120609', '1206', 'Vizcatan del Ene', 1),\n" +
                            "\t('120701', '1207', 'Tarma', 1),\n" +
                            "\t('120702', '1207', 'Acobamba', 1),\n" +
                            "\t('120703', '1207', 'Huaricolca', 1),\n" +
                            "\t('120704', '1207', 'Huasahuasi', 1),\n" +
                            "\t('120705', '1207', 'La Unión', 1),\n" +
                            "\t('120706', '1207', 'Palca', 1),\n" +
                            "\t('120707', '1207', 'Palcamayo', 1),\n" +
                            "\t('120708', '1207', 'San Pedro de Cajas', 1),\n" +
                            "\t('120709', '1207', 'Tapo', 1),\n" +
                            "\t('120801', '1208', 'La Oroya', 1),\n" +
                            "\t('120802', '1208', 'Chacapalpa', 1),\n" +
                            "\t('120803', '1208', 'Huay-Huay', 1),\n" +
                            "\t('120804', '1208', 'Marcapomacocha', 1),\n" +
                            "\t('120805', '1208', 'Morococha', 1),\n" +
                            "\t('120806', '1208', 'Paccha', 1),\n" +
                            "\t('120807', '1208', 'Santa Bárbara de Carhuacayan', 1),\n" +
                            "\t('120808', '1208', 'Santa Rosa de Sacco', 1),\n" +
                            "\t('120809', '1208', 'Suitucancha', 1),\n" +
                            "\t('120810', '1208', 'Yauli', 1),\n" +
                            "\t('120901', '1209', 'Chupaca', 1),\n" +
                            "\t('120902', '1209', 'Ahuac', 1),\n" +
                            "\t('120903', '1209', 'Chongos Bajo', 1),\n" +
                            "\t('120904', '1209', 'Huachac', 1),\n" +
                            "\t('120905', '1209', 'Huamancaca Chico', 1),\n" +
                            "\t('120906', '1209', 'San Juan de Iscos', 1),\n" +
                            "\t('120907', '1209', 'San Juan de Jarpa', 1),\n" +
                            "\t('120908', '1209', 'Tres de Diciembre', 1),\n" +
                            "\t('120909', '1209', 'Yanacancha', 1),\n" +
                            "\t('130101', '1301', 'Trujillo', 1),\n" +
                            "\t('130102', '1301', 'El Porvenir', 1),\n" +
                            "\t('130103', '1301', 'Florencia de Mora', 1),\n" +
                            "\t('130104', '1301', 'Huanchaco', 1),\n" +
                            "\t('130105', '1301', 'La Esperanza', 1),\n" +
                            "\t('130106', '1301', 'Laredo', 1),\n" +
                            "\t('130107', '1301', 'Moche', 1),\n" +
                            "\t('130108', '1301', 'Poroto', 1),\n" +
                            "\t('130109', '1301', 'Salaverry', 1),\n" +
                            "\t('130110', '1301', 'Simbal', 1),\n" +
                            "\t('130111', '1301', 'Victor Larco Herrera', 1),\n" +
                            "\t('130201', '1302', 'Ascope', 1),\n" +
                            "\t('130202', '1302', 'Chicama', 1),\n" +
                            "\t('130203', '1302', 'Chocope', 1),\n" +
                            "\t('130204', '1302', 'Magdalena de Cao', 1),\n" +
                            "\t('130205', '1302', 'Paijan', 1),\n" +
                            "\t('130206', '1302', 'Rázuri', 1),\n" +
                            "\t('130207', '1302', 'Santiago de Cao', 1),\n" +
                            "\t('130208', '1302', 'Casa Grande', 1),\n" +
                            "\t('130301', '1303', 'Bolívar', 1),\n" +
                            "\t('130302', '1303', 'Bambamarca', 1),\n" +
                            "\t('130303', '1303', 'Condormarca', 1),\n" +
                            "\t('130304', '1303', 'Longotea', 1),\n" +
                            "\t('130305', '1303', 'Uchumarca', 1),\n" +
                            "\t('130306', '1303', 'Ucuncha', 1),\n" +
                            "\t('130401', '1304', 'Chepen', 1),\n" +
                            "\t('130402', '1304', 'Pacanga', 1),\n" +
                            "\t('130403', '1304', 'Pueblo Nuevo', 1),\n" +
                            "\t('130501', '1305', 'Julcan', 1),\n" +
                            "\t('130502', '1305', 'Calamarca', 1),\n" +
                            "\t('130503', '1305', 'Carabamba', 1),\n" +
                            "\t('130504', '1305', 'Huaso', 1),\n" +
                            "\t('130601', '1306', 'Otuzco', 1),\n" +
                            "\t('130602', '1306', 'Agallpampa', 1),\n" +
                            "\t('130604', '1306', 'Charat', 1),\n" +
                            "\t('130605', '1306', 'Huaranchal', 1),\n" +
                            "\t('130606', '1306', 'La Cuesta', 1),\n" +
                            "\t('130608', '1306', 'Mache', 1),\n" +
                            "\t('130610', '1306', 'Paranday', 1),\n" +
                            "\t('130611', '1306', 'Salpo', 1),\n" +
                            "\t('130613', '1306', 'Sinsicap', 1),\n" +
                            "\t('130614', '1306', 'Usquil', 1),\n" +
                            "\t('130701', '1307', 'San Pedro de Lloc', 1),\n" +
                            "\t('130702', '1307', 'Guadalupe', 1),\n" +
                            "\t('130703', '1307', 'Jequetepeque', 1),\n" +
                            "\t('130704', '1307', 'Pacasmayo', 1),\n" +
                            "\t('130705', '1307', 'San José', 1),\n" +
                            "\t('130801', '1308', 'Tayabamba', 1),\n" +
                            "\t('130802', '1308', 'Buldibuyo', 1),\n" +
                            "\t('130803', '1308', 'Chillia', 1),\n" +
                            "\t('130804', '1308', 'Huancaspata', 1),\n" +
                            "\t('130805', '1308', 'Huaylillas', 1),\n" +
                            "\t('130806', '1308', 'Huayo', 1),\n" +
                            "\t('130807', '1308', 'Ongon', 1),\n" +
                            "\t('130808', '1308', 'Parcoy', 1),\n" +
                            "\t('130809', '1308', 'Pataz', 1),\n" +
                            "\t('130810', '1308', 'Pias', 1),\n" +
                            "\t('130811', '1308', 'Santiago de Challas', 1),\n" +
                            "\t('130812', '1308', 'Taurija', 1),\n" +
                            "\t('130813', '1308', 'Urpay', 1),\n" +
                            "\t('130901', '1309', 'Huamachuco', 1),\n" +
                            "\t('130902', '1309', 'Chugay', 1),\n" +
                            "\t('130903', '1309', 'Cochorco', 1),\n" +
                            "\t('130904', '1309', 'Curgos', 1),\n" +
                            "\t('130905', '1309', 'Marcabal', 1),\n" +
                            "\t('130906', '1309', 'Sanagoran', 1),\n" +
                            "\t('130907', '1309', 'Sarin', 1),\n" +
                            "\t('130908', '1309', 'Sartimbamba', 1),\n" +
                            "\t('131001', '1310', 'Santiago de Chuco', 1),\n" +
                            "\t('131002', '1310', 'Angasmarca', 1),\n" +
                            "\t('131003', '1310', 'Cachicadan', 1),\n" +
                            "\t('131004', '1310', 'Mollebamba', 1),\n" +
                            "\t('131005', '1310', 'Mollepata', 1),\n" +
                            "\t('131006', '1310', 'Quiruvilca', 1),\n" +
                            "\t('131007', '1310', 'Santa Cruz de Chuca', 1),\n" +
                            "\t('131008', '1310', 'Sitabamba', 1),\n" +
                            "\t('131101', '1311', 'Cascas', 1),\n" +
                            "\t('131102', '1311', 'Lucma', 1),\n" +
                            "\t('131103', '1311', 'Marmot', 1),\n" +
                            "\t('131104', '1311', 'Sayapullo', 1),\n" +
                            "\t('131201', '1312', 'Viru', 1),\n" +
                            "\t('131202', '1312', 'Chao', 1),\n" +
                            "\t('131203', '1312', 'Guadalupito', 1),\n" +
                            "\t('140101', '1401', 'Chiclayo', 1),\n" +
                            "\t('140102', '1401', 'Chongoyape', 1),\n" +
                            "\t('140103', '1401', 'Eten', 1),\n" +
                            "\t('140104', '1401', 'Eten Puerto', 1),\n" +
                            "\t('140105', '1401', 'José Leonardo Ortiz', 1),\n" +
                            "\t('140106', '1401', 'La Victoria', 1),\n" +
                            "\t('140107', '1401', 'Lagunas', 1),\n" +
                            "\t('140108', '1401', 'Monsefu', 1),\n" +
                            "\t('140109', '1401', 'Nueva Arica', 1),\n" +
                            "\t('140110', '1401', 'Oyotun', 1),\n" +
                            "\t('140111', '1401', 'Picsi', 1),\n" +
                            "\t('140112', '1401', 'Pimentel', 1),\n" +
                            "\t('140113', '1401', 'Reque', 1),\n" +
                            "\t('140114', '1401', 'Santa Rosa', 1),\n" +
                            "\t('140115', '1401', 'Saña', 1),\n" +
                            "\t('140116', '1401', 'Cayalti', 1),\n" +
                            "\t('140117', '1401', 'Patapo', 1),\n" +
                            "\t('140118', '1401', 'Pomalca', 1),\n" +
                            "\t('140119', '1401', 'Pucala', 1),\n" +
                            "\t('140120', '1401', 'Tuman', 1),\n" +
                            "\t('140201', '1402', 'Ferreñafe', 1),\n" +
                            "\t('140202', '1402', 'Cañaris', 1),\n" +
                            "\t('140203', '1402', 'Incahuasi', 1),\n" +
                            "\t('140204', '1402', 'Manuel Antonio Mesones Muro', 1),\n" +
                            "\t('140205', '1402', 'Pitipo', 1),\n" +
                            "\t('140206', '1402', 'Pueblo Nuevo', 1),\n" +
                            "\t('140301', '1403', 'Lambayeque', 1),\n" +
                            "\t('140302', '1403', 'Chochope', 1),\n" +
                            "\t('140303', '1403', 'Illimo', 1),\n" +
                            "\t('140304', '1403', 'Jayanca', 1),\n" +
                            "\t('140305', '1403', 'Mochumi', 1),\n" +
                            "\t('140306', '1403', 'Morrope', 1),\n" +
                            "\t('140307', '1403', 'Motupe', 1),\n" +
                            "\t('140308', '1403', 'Olmos', 1),\n" +
                            "\t('140309', '1403', 'Pacora', 1),\n" +
                            "\t('140310', '1403', 'Salas', 1),\n" +
                            "\t('140311', '1403', 'San José', 1),\n" +
                            "\t('140312', '1403', 'Tucume', 1),\n" +
                            "\t('150101', '1501', 'Lima', 1),\n" +
                            "\t('150102', '1501', 'Ancón', 1),\n" +
                            "\t('150103', '1501', 'Ate', 1),\n" +
                            "\t('150104', '1501', 'Barranco', 1),\n" +
                            "\t('150105', '1501', 'Breña', 1),\n" +
                            "\t('150106', '1501', 'Carabayllo', 1),\n" +
                            "\t('150107', '1501', 'Chaclacayo', 1),\n" +
                            "\t('150108', '1501', 'Chorrillos', 1),\n" +
                            "\t('150109', '1501', 'Cieneguilla', 1),\n" +
                            "\t('150110', '1501', 'Comas', 1),\n" +
                            "\t('150111', '1501', 'El Agustino', 1),\n" +
                            "\t('150112', '1501', 'Independencia', 1),\n" +
                            "\t('150113', '1501', 'Jesús María', 1),\n" +
                            "\t('150114', '1501', 'La Molina', 1),\n" +
                            "\t('150115', '1501', 'La Victoria', 1),\n" +
                            "\t('150116', '1501', 'Lince', 1),\n" +
                            "\t('150117', '1501', 'Los Olivos', 1),\n" +
                            "\t('150118', '1501', 'Lurigancho', 1),\n" +
                            "\t('150119', '1501', 'Lurin', 1),\n" +
                            "\t('150120', '1501', 'Magdalena del Mar', 1),\n" +
                            "\t('150121', '1501', 'Pueblo Libre', 1),\n" +
                            "\t('150122', '1501', 'Miraflores', 1),\n" +
                            "\t('150123', '1501', 'Pachacamac', 1),\n" +
                            "\t('150124', '1501', 'Pucusana', 1),\n" +
                            "\t('150125', '1501', 'Puente Piedra', 1),\n" +
                            "\t('150126', '1501', 'Punta Hermosa', 1),\n" +
                            "\t('150127', '1501', 'Punta Negra', 1),\n" +
                            "\t('150128', '1501', 'Rímac', 1),\n" +
                            "\t('150129', '1501', 'San Bartolo', 1),\n" +
                            "\t('150130', '1501', 'San Borja', 1),\n" +
                            "\t('150131', '1501', 'San Isidro', 1),\n" +
                            "\t('150132', '1501', 'San Juan de Lurigancho', 1),\n" +
                            "\t('150133', '1501', 'San Juan de Miraflores', 1),\n" +
                            "\t('150134', '1501', 'San Luis', 1),\n" +
                            "\t('150135', '1501', 'San Martín de Porres', 1),\n" +
                            "\t('150136', '1501', 'San Miguel', 1),\n" +
                            "\t('150137', '1501', 'Santa Anita', 1),\n" +
                            "\t('150138', '1501', 'Santa María del Mar', 1),\n" +
                            "\t('150139', '1501', 'Santa Rosa', 1),\n" +
                            "\t('150140', '1501', 'Santiago de Surco', 1),\n" +
                            "\t('150141', '1501', 'Surquillo', 1),\n" +
                            "\t('150142', '1501', 'Villa El Salvador', 1),\n" +
                            "\t('150143', '1501', 'Villa María del Triunfo', 1),\n" +
                            "\t('150201', '1502', 'Barranca', 1),\n" +
                            "\t('150202', '1502', 'Paramonga', 1),\n" +
                            "\t('150203', '1502', 'Pativilca', 1),\n" +
                            "\t('150204', '1502', 'Supe', 1),\n" +
                            "\t('150205', '1502', 'Supe Puerto', 1),\n" +
                            "\t('150301', '1503', 'Cajatambo', 1),\n" +
                            "\t('150302', '1503', 'Copa', 1),\n" +
                            "\t('150303', '1503', 'Gorgor', 1),\n" +
                            "\t('150304', '1503', 'Huancapon', 1),\n" +
                            "\t('150305', '1503', 'Manas', 1),\n" +
                            "\t('150401', '1504', 'Canta', 1),\n" +
                            "\t('150402', '1504', 'Arahuay', 1),\n" +
                            "\t('150403', '1504', 'Huamantanga', 1),\n" +
                            "\t('150404', '1504', 'Huaros', 1),\n" +
                            "\t('150405', '1504', 'Lachaqui', 1),\n" +
                            "\t('150406', '1504', 'San Buenaventura', 1),\n" +
                            "\t('150407', '1504', 'Santa Rosa de Quives', 1),\n" +
                            "\t('150501', '1505', 'San Vicente de Cañete', 1),\n" +
                            "\t('150502', '1505', 'Asia', 1),\n" +
                            "\t('150503', '1505', 'Calango', 1),\n" +
                            "\t('150504', '1505', 'Cerro Azul', 1),\n" +
                            "\t('150505', '1505', 'Chilca', 1),\n" +
                            "\t('150506', '1505', 'Coayllo', 1),\n" +
                            "\t('150507', '1505', 'Imperial', 1),\n" +
                            "\t('150508', '1505', 'Lunahuana', 1),\n" +
                            "\t('150509', '1505', 'Mala', 1),\n" +
                            "\t('150510', '1505', 'Nuevo Imperial', 1),\n" +
                            "\t('150511', '1505', 'Pacaran', 1),\n" +
                            "\t('150512', '1505', 'Quilmana', 1),\n" +
                            "\t('150513', '1505', 'San Antonio', 1),\n" +
                            "\t('150514', '1505', 'San Luis', 1),\n" +
                            "\t('150515', '1505', 'Santa Cruz de Flores', 1),\n" +
                            "\t('150516', '1505', 'Zúñiga', 1),\n" +
                            "\t('150601', '1506', 'Huaral', 1),\n" +
                            "\t('150602', '1506', 'Atavillos Alto', 1),\n" +
                            "\t('150603', '1506', 'Atavillos Bajo', 1),\n" +
                            "\t('150604', '1506', 'Aucallama', 1),\n" +
                            "\t('150605', '1506', 'Chancay', 1),\n" +
                            "\t('150606', '1506', 'Ihuari', 1),\n" +
                            "\t('150607', '1506', 'Lampian', 1),\n" +
                            "\t('150608', '1506', 'Pacaraos', 1),\n" +
                            "\t('150609', '1506', 'San Miguel de Acos', 1),\n" +
                            "\t('150610', '1506', 'Santa Cruz de Andamarca', 1),\n" +
                            "\t('150611', '1506', 'Sumbilca', 1),\n" +
                            "\t('150612', '1506', 'Veintisiete de Noviembre', 1),\n" +
                            "\t('150701', '1507', 'Matucana', 1),\n" +
                            "\t('150702', '1507', 'Antioquia', 1),\n" +
                            "\t('150703', '1507', 'Callahuanca', 1),\n" +
                            "\t('150704', '1507', 'Carampoma', 1),\n" +
                            "\t('150705', '1507', 'Chicla', 1),\n" +
                            "\t('150706', '1507', 'Cuenca', 1),\n" +
                            "\t('150707', '1507', 'Huachupampa', 1),\n" +
                            "\t('150708', '1507', 'Huanza', 1),\n" +
                            "\t('150709', '1507', 'Huarochiri', 1),\n" +
                            "\t('150710', '1507', 'Lahuaytambo', 1),\n" +
                            "\t('150711', '1507', 'Langa', 1),\n" +
                            "\t('150712', '1507', 'Laraos', 1),\n" +
                            "\t('150713', '1507', 'Mariatana', 1),\n" +
                            "\t('150714', '1507', 'Ricardo Palma', 1),\n" +
                            "\t('150715', '1507', 'San Andrés de Tupicocha', 1),\n" +
                            "\t('150716', '1507', 'San Antonio', 1),\n" +
                            "\t('150717', '1507', 'San Bartolomé', 1),\n" +
                            "\t('150718', '1507', 'San Damian', 1),\n" +
                            "\t('150719', '1507', 'San Juan de Iris', 1),\n" +
                            "\t('150720', '1507', 'San Juan de Tantaranche', 1),\n" +
                            "\t('150721', '1507', 'San Lorenzo de Quinti', 1),\n" +
                            "\t('150722', '1507', 'San Mateo', 1),\n" +
                            "\t('150723', '1507', 'San Mateo de Otao', 1),\n" +
                            "\t('150724', '1507', 'San Pedro de Casta', 1),\n" +
                            "\t('150725', '1507', 'San Pedro de Huancayre', 1),\n" +
                            "\t('150726', '1507', 'Sangallaya', 1),\n" +
                            "\t('150727', '1507', 'Santa Cruz de Cocachacra', 1),\n" +
                            "\t('150728', '1507', 'Santa Eulalia', 1),\n" +
                            "\t('150729', '1507', 'Santiago de Anchucaya', 1),\n" +
                            "\t('150730', '1507', 'Santiago de Tuna', 1),\n" +
                            "\t('150731', '1507', 'Santo Domingo de Los Olleros', 1),\n" +
                            "\t('150732', '1507', 'Surco', 1),\n" +
                            "\t('150801', '1508', 'Huacho', 1),\n" +
                            "\t('150802', '1508', 'Ambar', 1),\n" +
                            "\t('150803', '1508', 'Caleta de Carquin', 1),\n" +
                            "\t('150804', '1508', 'Checras', 1),\n" +
                            "\t('150805', '1508', 'Hualmay', 1),\n" +
                            "\t('150806', '1508', 'Huaura', 1),\n" +
                            "\t('150807', '1508', 'Leoncio Prado', 1),\n" +
                            "\t('150808', '1508', 'Paccho', 1),\n" +
                            "\t('150809', '1508', 'Santa Leonor', 1),\n" +
                            "\t('150810', '1508', 'Santa María', 1),\n" +
                            "\t('150811', '1508', 'Sayan', 1),\n" +
                            "\t('150812', '1508', 'Vegueta', 1),\n" +
                            "\t('150901', '1509', 'Oyon', 1),\n" +
                            "\t('150902', '1509', 'Andajes', 1),\n" +
                            "\t('150903', '1509', 'Caujul', 1),\n" +
                            "\t('150904', '1509', 'Cochamarca', 1),\n" +
                            "\t('150905', '1509', 'Navan', 1),\n" +
                            "\t('150906', '1509', 'Pachangara', 1),\n" +
                            "\t('151001', '1510', 'Yauyos', 1),\n" +
                            "\t('151002', '1510', 'Alis', 1),\n" +
                            "\t('151003', '1510', 'Allauca', 1),\n" +
                            "\t('151004', '1510', 'Ayaviri', 1),\n" +
                            "\t('151005', '1510', 'Azángaro', 1),\n" +
                            "\t('151006', '1510', 'Cacra', 1),\n" +
                            "\t('151007', '1510', 'Carania', 1),\n" +
                            "\t('151008', '1510', 'Catahuasi', 1),\n" +
                            "\t('151009', '1510', 'Chocos', 1),\n" +
                            "\t('151010', '1510', 'Cochas', 1),\n" +
                            "\t('151011', '1510', 'Colonia', 1),\n" +
                            "\t('151012', '1510', 'Hongos', 1),\n" +
                            "\t('151013', '1510', 'Huampara', 1),\n" +
                            "\t('151014', '1510', 'Huancaya', 1),\n" +
                            "\t('151015', '1510', 'Huangascar', 1),\n" +
                            "\t('151016', '1510', 'Huantan', 1),\n" +
                            "\t('151017', '1510', 'Huañec', 1),\n" +
                            "\t('151018', '1510', 'Laraos', 1),\n" +
                            "\t('151019', '1510', 'Lincha', 1),\n" +
                            "\t('151020', '1510', 'Madean', 1),\n" +
                            "\t('151021', '1510', 'Miraflores', 1),\n" +
                            "\t('151022', '1510', 'Omas', 1),\n" +
                            "\t('151023', '1510', 'Putinza', 1),\n" +
                            "\t('151024', '1510', 'Quinches', 1),\n" +
                            "\t('151025', '1510', 'Quinocay', 1),\n" +
                            "\t('151026', '1510', 'San Joaquín', 1),\n" +
                            "\t('151027', '1510', 'San Pedro de Pilas', 1),\n" +
                            "\t('151028', '1510', 'Tanta', 1),\n" +
                            "\t('151029', '1510', 'Tauripampa', 1),\n" +
                            "\t('151030', '1510', 'Tomas', 1),\n" +
                            "\t('151031', '1510', 'Tupe', 1),\n" +
                            "\t('151032', '1510', 'Viñac', 1),\n" +
                            "\t('151033', '1510', 'Vitis', 1),\n" +
                            "\t('160101', '1601', 'Iquitos', 1),\n" +
                            "\t('160102', '1601', 'Alto Nanay', 1),\n" +
                            "\t('160103', '1601', 'Fernando Lores', 1),\n" +
                            "\t('160104', '1601', 'Indiana', 1),\n" +
                            "\t('160105', '1601', 'Las Amazonas', 1),\n" +
                            "\t('160106', '1601', 'Mazan', 1),\n" +
                            "\t('160107', '1601', 'Napo', 1),\n" +
                            "\t('160108', '1601', 'Punchana', 1),\n" +
                            "\t('160110', '1601', 'Torres Causana', 1),\n" +
                            "\t('160112', '1601', 'Belén', 1),\n" +
                            "\t('160113', '1601', 'San Juan Bautista', 1),\n" +
                            "\t('160201', '1602', 'Yurimaguas', 1),\n" +
                            "\t('160202', '1602', 'Balsapuerto', 1),\n" +
                            "\t('160205', '1602', 'Jeberos', 1),\n" +
                            "\t('160206', '1602', 'Lagunas', 1),\n" +
                            "\t('160210', '1602', 'Santa Cruz', 1),\n" +
                            "\t('160211', '1602', 'Teniente Cesar López Rojas', 1),\n" +
                            "\t('160301', '1603', 'Nauta', 1),\n" +
                            "\t('160302', '1603', 'Parinari', 1),\n" +
                            "\t('160303', '1603', 'Tigre', 1),\n" +
                            "\t('160304', '1603', 'Trompeteros', 1),\n" +
                            "\t('160305', '1603', 'Urarinas', 1),\n" +
                            "\t('160401', '1604', 'Ramón Castilla', 1),\n" +
                            "\t('160402', '1604', 'Pebas', 1),\n" +
                            "\t('160403', '1604', 'Yavari', 1),\n" +
                            "\t('160404', '1604', 'San Pablo', 1),\n" +
                            "\t('160501', '1605', 'Requena', 1),\n" +
                            "\t('160502', '1605', 'Alto Tapiche', 1),\n" +
                            "\t('160503', '1605', 'Capelo', 1),\n" +
                            "\t('160504', '1605', 'Emilio San Martín', 1),\n" +
                            "\t('160505', '1605', 'Maquia', 1),\n" +
                            "\t('160506', '1605', 'Puinahua', 1),\n" +
                            "\t('160507', '1605', 'Saquena', 1),\n" +
                            "\t('160508', '1605', 'Soplin', 1),\n" +
                            "\t('160509', '1605', 'Tapiche', 1),\n" +
                            "\t('160510', '1605', 'Jenaro Herrera', 1),\n" +
                            "\t('160511', '1605', 'Yaquerana', 1),\n" +
                            "\t('160601', '1606', 'Contamana', 1),\n" +
                            "\t('160602', '1606', 'Inahuaya', 1),\n" +
                            "\t('160603', '1606', 'Padre Márquez', 1),\n" +
                            "\t('160604', '1606', 'Pampa Hermosa', 1),\n" +
                            "\t('160605', '1606', 'Sarayacu', 1),\n" +
                            "\t('160606', '1606', 'Vargas Guerra', 1),\n" +
                            "\t('160701', '1607', 'Barranca', 1),\n" +
                            "\t('160702', '1607', 'Cahuapanas', 1),\n" +
                            "\t('160703', '1607', 'Manseriche', 1),\n" +
                            "\t('160704', '1607', 'Morona', 1),\n" +
                            "\t('160705', '1607', 'Pastaza', 1),\n" +
                            "\t('160706', '1607', 'Andoas', 1),\n" +
                            "\t('160801', '1608', 'Putumayo', 1),\n" +
                            "\t('160802', '1608', 'Rosa Panduro', 1),\n" +
                            "\t('160803', '1608', 'Teniente Manuel Clavero', 1),\n" +
                            "\t('160804', '1608', 'Yaguas', 1),\n" +
                            "\t('170101', '1701', 'Tambopata', 1),\n" +
                            "\t('170102', '1701', 'Inambari', 1),\n" +
                            "\t('170103', '1701', 'Las Piedras', 1),\n" +
                            "\t('170104', '1701', 'Laberinto', 1),\n" +
                            "\t('170201', '1702', 'Manu', 1),\n" +
                            "\t('170202', '1702', 'Fitzcarrald', 1),\n" +
                            "\t('170203', '1702', 'Madre de Dios', 1),\n" +
                            "\t('170204', '1702', 'Huepetuhe', 1),\n" +
                            "\t('170301', '1703', 'Iñapari', 1),\n" +
                            "\t('170302', '1703', 'Iberia', 1),\n" +
                            "\t('170303', '1703', 'Tahuamanu', 1),\n" +
                            "\t('180101', '1801', 'Moquegua', 1),\n" +
                            "\t('180102', '1801', 'Carumas', 1),\n" +
                            "\t('180103', '1801', 'Cuchumbaya', 1),\n" +
                            "\t('180104', '1801', 'Samegua', 1),\n" +
                            "\t('180105', '1801', 'San Cristóbal', 1),\n" +
                            "\t('180106', '1801', 'Torata', 1),\n" +
                            "\t('180201', '1802', 'Omate', 1),\n" +
                            "\t('180202', '1802', 'Chojata', 1),\n" +
                            "\t('180203', '1802', 'Coalaque', 1),\n" +
                            "\t('180204', '1802', 'Ichuña', 1),\n" +
                            "\t('180205', '1802', 'La Capilla', 1),\n" +
                            "\t('180206', '1802', 'Lloque', 1),\n" +
                            "\t('180207', '1802', 'Matalaque', 1),\n" +
                            "\t('180208', '1802', 'Puquina', 1),\n" +
                            "\t('180209', '1802', 'Quinistaquillas', 1),\n" +
                            "\t('180210', '1802', 'Ubinas', 1),\n" +
                            "\t('180211', '1802', 'Yunga', 1),\n" +
                            "\t('180301', '1803', 'Ilo', 1),\n" +
                            "\t('180302', '1803', 'El Algarrobal', 1),\n" +
                            "\t('180303', '1803', 'Pacocha', 1),\n" +
                            "\t('190101', '1901', 'Chaupimarca', 1),\n" +
                            "\t('190102', '1901', 'Huachon', 1),\n" +
                            "\t('190103', '1901', 'Huariaca', 1),\n" +
                            "\t('190104', '1901', 'Huayllay', 1),\n" +
                            "\t('190105', '1901', 'Ninacaca', 1),\n" +
                            "\t('190106', '1901', 'Pallanchacra', 1),\n" +
                            "\t('190107', '1901', 'Paucartambo', 1),\n" +
                            "\t('190108', '1901', 'San Francisco de Asís de Yarusyacan', 1),\n" +
                            "\t('190109', '1901', 'Simon Bolívar', 1),\n" +
                            "\t('190110', '1901', 'Ticlacayan', 1),\n" +
                            "\t('190111', '1901', 'Tinyahuarco', 1),\n" +
                            "\t('190112', '1901', 'Vicco', 1),\n" +
                            "\t('190113', '1901', 'Yanacancha', 1),\n" +
                            "\t('190201', '1902', 'Yanahuanca', 1),\n" +
                            "\t('190202', '1902', 'Chacayan', 1),\n" +
                            "\t('190203', '1902', 'Goyllarisquizga', 1),\n" +
                            "\t('190204', '1902', 'Paucar', 1),\n" +
                            "\t('190205', '1902', 'San Pedro de Pillao', 1),\n" +
                            "\t('190206', '1902', 'Santa Ana de Tusi', 1),\n" +
                            "\t('190207', '1902', 'Tapuc', 1),\n" +
                            "\t('190208', '1902', 'Vilcabamba', 1),\n" +
                            "\t('190301', '1903', 'Oxapampa', 1),\n" +
                            "\t('190302', '1903', 'Chontabamba', 1),\n" +
                            "\t('190303', '1903', 'Huancabamba', 1),\n" +
                            "\t('190304', '1903', 'Palcazu', 1),\n" +
                            "\t('190305', '1903', 'Pozuzo', 1),\n" +
                            "\t('190306', '1903', 'Puerto Bermúdez', 1),\n" +
                            "\t('190307', '1903', 'Villa Rica', 1),\n" +
                            "\t('190308', '1903', 'Constitución', 1),\n" +
                            "\t('200101', '2001', 'Piura', 1),\n" +
                            "\t('200104', '2001', 'Castilla', 1),\n" +
                            "\t('200105', '2001', 'Catacaos', 1),\n" +
                            "\t('200107', '2001', 'Cura Mori', 1),\n" +
                            "\t('200108', '2001', 'El Tallan', 1),\n" +
                            "\t('200109', '2001', 'La Arena', 1),\n" +
                            "\t('200110', '2001', 'La Unión', 1),\n" +
                            "\t('200111', '2001', 'Las Lomas', 1),\n" +
                            "\t('200114', '2001', 'Tambo Grande', 1),\n" +
                            "\t('200115', '2001', 'Veintiseis de Octubre', 1),\n" +
                            "\t('200201', '2002', 'Ayabaca', 1),\n" +
                            "\t('200202', '2002', 'Frias', 1),\n" +
                            "\t('200203', '2002', 'Jilili', 1),\n" +
                            "\t('200204', '2002', 'Lagunas', 1),\n" +
                            "\t('200205', '2002', 'Montero', 1),\n" +
                            "\t('200206', '2002', 'Pacaipampa', 1),\n" +
                            "\t('200207', '2002', 'Paimas', 1),\n" +
                            "\t('200208', '2002', 'Sapillica', 1),\n" +
                            "\t('200209', '2002', 'Sicchez', 1),\n" +
                            "\t('200210', '2002', 'Suyo', 1),\n" +
                            "\t('200301', '2003', 'Huancabamba', 1),\n" +
                            "\t('200302', '2003', 'Canchaque', 1),\n" +
                            "\t('200303', '2003', 'El Carmen de la Frontera', 1),\n" +
                            "\t('200304', '2003', 'Huarmaca', 1),\n" +
                            "\t('200305', '2003', 'Lalaquiz', 1),\n" +
                            "\t('200306', '2003', 'San Miguel de El Faique', 1),\n" +
                            "\t('200307', '2003', 'Sondor', 1),\n" +
                            "\t('200308', '2003', 'Sondorillo', 1),\n" +
                            "\t('200401', '2004', 'Chulucanas', 1),\n" +
                            "\t('200402', '2004', 'Buenos Aires', 1),\n" +
                            "\t('200403', '2004', 'Chalaco', 1),\n" +
                            "\t('200404', '2004', 'La Matanza', 1),\n" +
                            "\t('200405', '2004', 'Morropon', 1),\n" +
                            "\t('200406', '2004', 'Salitral', 1),\n" +
                            "\t('200407', '2004', 'San Juan de Bigote', 1),\n" +
                            "\t('200408', '2004', 'Santa Catalina de Mossa', 1),\n" +
                            "\t('200409', '2004', 'Santo Domingo', 1),\n" +
                            "\t('200410', '2004', 'YAMANGO', 1),\n" +
                            "\t('200501', '2005', 'PAITA', 1),\n" +
                            "\t('200502', '2005', 'AMOTAPE', 1),\n" +
                            "\t('200503', '2005', 'ARENAL', 1),\n" +
                            "\t('200504', '2005', 'COLAN', 1),\n" +
                            "\t('200505', '2005', 'LA HUACA', 1),\n" +
                            "\t('200506', '2005', 'Tamarindo', 1),\n" +
                            "\t('200507', '2005', 'Vichayal', 1),\n" +
                            "\t('200601', '2006', 'SULLANA', 1),\n" +
                            "\t('200602', '2006', 'Bellavista', 1),\n" +
                            "\t('200603', '2006', 'Ignacio Escudero', 1),\n" +
                            "\t('200604', '2006', 'Lancones', 1),\n" +
                            "\t('200605', '2006', 'Marcavelica', 1),\n" +
                            "\t('200606', '2006', 'Miguel Checa', 1),\n" +
                            "\t('200607', '2006', 'Querecotillo', 1),\n" +
                            "\t('200608', '2006', 'Salitral', 1),\n" +
                            "\t('200701', '2007', 'PARIÑAS', 1),\n" +
                            "\t('200702', '2007', 'EL ALTO', 1),\n" +
                            "\t('200703', '2007', 'LA BREA', 1),\n" +
                            "\t('200704', '2007', 'LOBITOS', 1),\n" +
                            "\t('200705', '2007', 'Los Organos', 1),\n" +
                            "\t('200706', '2007', 'MANCORA', 1),\n" +
                            "\t('200801', '2008', 'SECHURA', 1),\n" +
                            "\t('200802', '2008', 'Bellavista de la Unión', 1),\n" +
                            "\t('200803', '2008', 'BERNAL', 1),\n" +
                            "\t('200804', '2008', 'Cristo Nos Valga', 1),\n" +
                            "\t('200805', '2008', 'Vice', 1),\n" +
                            "\t('200806', '2008', 'Rinconada Llicuar', 1),\n" +
                            "\t('210101', '2101', 'Puno', 1),\n" +
                            "\t('210102', '2101', 'Acora', 1),\n" +
                            "\t('210103', '2101', 'Amantani', 1),\n" +
                            "\t('210104', '2101', 'Atuncolla', 1),\n" +
                            "\t('210105', '2101', 'Capachica', 1),\n" +
                            "\t('210106', '2101', 'Chucuito', 1),\n" +
                            "\t('210107', '2101', 'Coata', 1),\n" +
                            "\t('210108', '2101', 'Huata', 1),\n" +
                            "\t('210109', '2101', 'Mañazo', 1),\n" +
                            "\t('210110', '2101', 'Paucarcolla', 1),\n" +
                            "\t('210111', '2101', 'Pichacani', 1),\n" +
                            "\t('210112', '2101', 'Plateria', 1),\n" +
                            "\t('210113', '2101', 'San Antonio', 1),\n" +
                            "\t('210114', '2101', 'Tiquillaca', 1),\n" +
                            "\t('210115', '2101', 'Vilque', 1),\n" +
                            "\t('210201', '2102', 'Azángaro', 1),\n" +
                            "\t('210202', '2102', 'Achaya', 1),\n" +
                            "\t('210203', '2102', 'Arapa', 1),\n" +
                            "\t('210204', '2102', 'Asillo', 1),\n" +
                            "\t('210205', '2102', 'Caminaca', 1),\n" +
                            "\t('210206', '2102', 'Chupa', 1),\n" +
                            "\t('210207', '2102', 'José Domingo Choquehuanca', 1),\n" +
                            "\t('210208', '2102', 'Muñani', 1),\n" +
                            "\t('210209', '2102', 'Potoni', 1),\n" +
                            "\t('210210', '2102', 'Saman', 1),\n" +
                            "\t('210211', '2102', 'San Anton', 1),\n" +
                            "\t('210212', '2102', 'San José', 1),\n" +
                            "\t('210213', '2102', 'San Juan de Salinas', 1),\n" +
                            "\t('210214', '2102', 'Santiago de Pupuja', 1),\n" +
                            "\t('210215', '2102', 'Tirapata', 1),\n" +
                            "\t('210301', '2103', 'Macusani', 1),\n" +
                            "\t('210302', '2103', 'Ajoyani', 1),\n" +
                            "\t('210303', '2103', 'Ayapata', 1),\n" +
                            "\t('210304', '2103', 'Coasa', 1),\n" +
                            "\t('210305', '2103', 'Corani', 1),\n" +
                            "\t('210306', '2103', 'Crucero', 1),\n" +
                            "\t('210307', '2103', 'Ituata', 1),\n" +
                            "\t('210308', '2103', 'Ollachea', 1),\n" +
                            "\t('210309', '2103', 'San Gaban', 1),\n" +
                            "\t('210310', '2103', 'Usicayos', 1),\n" +
                            "\t('210401', '2104', 'Juli', 1),\n" +
                            "\t('210402', '2104', 'Desaguadero', 1),\n" +
                            "\t('210403', '2104', 'Huacullani', 1),\n" +
                            "\t('210404', '2104', 'Kelluyo', 1),\n" +
                            "\t('210405', '2104', 'Pisacoma', 1),\n" +
                            "\t('210406', '2104', 'Pomata', 1),\n" +
                            "\t('210407', '2104', 'Zepita', 1),\n" +
                            "\t('210501', '2105', 'Ilave', 1),\n" +
                            "\t('210502', '2105', 'Capazo', 1),\n" +
                            "\t('210503', '2105', 'Pilcuyo', 1),\n" +
                            "\t('210504', '2105', 'Santa Rosa', 1),\n" +
                            "\t('210505', '2105', 'Conduriri', 1),\n" +
                            "\t('210601', '2106', 'Huancane', 1),\n" +
                            "\t('210602', '2106', 'Cojata', 1),\n" +
                            "\t('210603', '2106', 'Huatasani', 1),\n" +
                            "\t('210604', '2106', 'Inchupalla', 1),\n" +
                            "\t('210605', '2106', 'Pusi', 1),\n" +
                            "\t('210606', '2106', 'Rosaspata', 1),\n" +
                            "\t('210607', '2106', 'Taraco', 1),\n" +
                            "\t('210608', '2106', 'Vilque Chico', 1),\n" +
                            "\t('210701', '2107', 'Lampa', 1),\n" +
                            "\t('210702', '2107', 'Cabanilla', 1),\n" +
                            "\t('210703', '2107', 'Calapuja', 1),\n" +
                            "\t('210704', '2107', 'Nicasio', 1),\n" +
                            "\t('210705', '2107', 'Ocuviri', 1),\n" +
                            "\t('210706', '2107', 'Palca', 1),\n" +
                            "\t('210707', '2107', 'Paratia', 1),\n" +
                            "\t('210708', '2107', 'Pucara', 1),\n" +
                            "\t('210709', '2107', 'Santa Lucia', 1),\n" +
                            "\t('210710', '2107', 'Vilavila', 1),\n" +
                            "\t('210801', '2108', 'Ayaviri', 1),\n" +
                            "\t('210802', '2108', 'Antauta', 1),\n" +
                            "\t('210803', '2108', 'Cupi', 1),\n" +
                            "\t('210804', '2108', 'Llalli', 1),\n" +
                            "\t('210805', '2108', 'Macari', 1),\n" +
                            "\t('210806', '2108', 'Nuñoa', 1),\n" +
                            "\t('210807', '2108', 'Orurillo', 1),\n" +
                            "\t('210808', '2108', 'Santa Rosa', 1),\n" +
                            "\t('210809', '2108', 'Umachiri', 1),\n" +
                            "\t('210901', '2109', 'Moho', 1),\n" +
                            "\t('210902', '2109', 'Conima', 1),\n" +
                            "\t('210903', '2109', 'Huayrapata', 1),\n" +
                            "\t('210904', '2109', 'Tilali', 1),\n" +
                            "\t('211001', '2110', 'Putina', 1),\n" +
                            "\t('211002', '2110', 'Ananea', 1),\n" +
                            "\t('211003', '2110', 'Pedro Vilca Apaza', 1),\n" +
                            "\t('211004', '2110', 'Quilcapuncu', 1),\n" +
                            "\t('211005', '2110', 'Sina', 1),\n" +
                            "\t('211101', '2111', 'Juliaca', 1),\n" +
                            "\t('211102', '2111', 'Cabana', 1),\n" +
                            "\t('211103', '2111', 'Cabanillas', 1),\n" +
                            "\t('211104', '2111', 'Caracoto', 1),\n" +
                            "\t('211201', '2112', 'Sandia', 1),\n" +
                            "\t('211202', '2112', 'Cuyocuyo', 1),\n" +
                            "\t('211203', '2112', 'Limbani', 1),\n" +
                            "\t('211204', '2112', 'Patambuco', 1),\n" +
                            "\t('211205', '2112', 'Phara', 1),\n" +
                            "\t('211206', '2112', 'Quiaca', 1),\n" +
                            "\t('211207', '2112', 'San Juan del Oro', 1),\n" +
                            "\t('211208', '2112', 'Yanahuaya', 1),\n" +
                            "\t('211209', '2112', 'Alto Inambari', 1),\n" +
                            "\t('211210', '2112', 'San Pedro de Putina Punco', 1),\n" +
                            "\t('211301', '2113', 'Yunguyo', 1),\n" +
                            "\t('211302', '2113', 'Anapia', 1),\n" +
                            "\t('211303', '2113', 'Copani', 1),\n" +
                            "\t('211304', '2113', 'Cuturapi', 1),\n" +
                            "\t('211305', '2113', 'Ollaraya', 1),\n" +
                            "\t('211306', '2113', 'Tinicachi', 1),\n" +
                            "\t('211307', '2113', 'Unicachi', 1),\n" +
                            "\t('220101', '2201', 'Moyobamba', 1),\n" +
                            "\t('220102', '2201', 'Calzada', 1),\n" +
                            "\t('220103', '2201', 'Habana', 1),\n" +
                            "\t('220104', '2201', 'Jepelacio', 1),\n" +
                            "\t('220105', '2201', 'Soritor', 1),\n" +
                            "\t('220106', '2201', 'Yantalo', 1),\n" +
                            "\t('220201', '2202', 'Bellavista', 1),\n" +
                            "\t('220202', '2202', 'Alto Biavo', 1),\n" +
                            "\t('220203', '2202', 'Bajo Biavo', 1),\n" +
                            "\t('220204', '2202', 'Huallaga', 1),\n" +
                            "\t('220205', '2202', 'San Pablo', 1),\n" +
                            "\t('220206', '2202', 'San Rafael', 1),\n" +
                            "\t('220301', '2203', 'San José de Sisa', 1),\n" +
                            "\t('220302', '2203', 'Agua Blanca', 1),\n" +
                            "\t('220303', '2203', 'San Martín', 1),\n" +
                            "\t('220304', '2203', 'Santa Rosa', 1),\n" +
                            "\t('220305', '2203', 'Shatoja', 1),\n" +
                            "\t('220401', '2204', 'Saposoa', 1),\n" +
                            "\t('220402', '2204', 'Alto Saposoa', 1),\n" +
                            "\t('220403', '2204', 'El Eslabón', 1),\n" +
                            "\t('220404', '2204', 'Piscoyacu', 1),\n" +
                            "\t('220405', '2204', 'Sacanche', 1),\n" +
                            "\t('220406', '2204', 'Tingo de Saposoa', 1),\n" +
                            "\t('220501', '2205', 'Lamas', 1),\n" +
                            "\t('220502', '2205', 'Alonso de Alvarado', 1),\n" +
                            "\t('220503', '2205', 'Barranquita', 1),\n" +
                            "\t('220504', '2205', 'Caynarachi', 1),\n" +
                            "\t('220505', '2205', 'Cuñumbuqui', 1),\n" +
                            "\t('220506', '2205', 'Pinto Recodo', 1),\n" +
                            "\t('220507', '2205', 'Rumisapa', 1),\n" +
                            "\t('220508', '2205', 'San Roque de Cumbaza', 1),\n" +
                            "\t('220509', '2205', 'Shanao', 1),\n" +
                            "\t('220510', '2205', 'Tabalosos', 1),\n" +
                            "\t('220511', '2205', 'Zapatero', 1),\n" +
                            "\t('220601', '2206', 'Juanjuí', 1),\n" +
                            "\t('220602', '2206', 'Campanilla', 1),\n" +
                            "\t('220603', '2206', 'Huicungo', 1),\n" +
                            "\t('220604', '2206', 'Pachiza', 1),\n" +
                            "\t('220605', '2206', 'Pajarillo', 1),\n" +
                            "\t('220701', '2207', 'Picota', 1),\n" +
                            "\t('220702', '2207', 'Buenos Aires', 1),\n" +
                            "\t('220703', '2207', 'Caspisapa', 1),\n" +
                            "\t('220704', '2207', 'Pilluana', 1),\n" +
                            "\t('220705', '2207', 'Pucacaca', 1),\n" +
                            "\t('220706', '2207', 'San Cristóbal', 1),\n" +
                            "\t('220707', '2207', 'San Hilarión', 1),\n" +
                            "\t('220708', '2207', 'Shamboyacu', 1),\n" +
                            "\t('220709', '2207', 'Tingo de Ponasa', 1),\n" +
                            "\t('220710', '2207', 'Tres Unidos', 1),\n" +
                            "\t('220801', '2208', 'Rioja', 1),\n" +
                            "\t('220802', '2208', 'Awajun', 1),\n" +
                            "\t('220803', '2208', 'Elías Soplin Vargas', 1),\n" +
                            "\t('220804', '2208', 'Nueva Cajamarca', 1),\n" +
                            "\t('220805', '2208', 'Pardo Miguel', 1),\n" +
                            "\t('220806', '2208', 'Posic', 1),\n" +
                            "\t('220807', '2208', 'San Fernando', 1),\n" +
                            "\t('220808', '2208', 'Yorongos', 1),\n" +
                            "\t('220809', '2208', 'Yuracyacu', 1),\n" +
                            "\t('220901', '2209', 'Tarapoto', 1),\n" +
                            "\t('220902', '2209', 'Alberto Leveau', 1),\n" +
                            "\t('220903', '2209', 'Cacatachi', 1),\n" +
                            "\t('220904', '2209', 'Chazuta', 1),\n" +
                            "\t('220905', '2209', 'Chipurana', 1),\n" +
                            "\t('220906', '2209', 'El Porvenir', 1),\n" +
                            "\t('220907', '2209', 'Huimbayoc', 1),\n" +
                            "\t('220908', '2209', 'Juan Guerra', 1),\n" +
                            "\t('220909', '2209', 'La Banda de Shilcayo', 1),\n" +
                            "\t('220910', '2209', 'Morales', 1),\n" +
                            "\t('220911', '2209', 'Papaplaya', 1),\n" +
                            "\t('220912', '2209', 'San Antonio', 1),\n" +
                            "\t('220913', '2209', 'Sauce', 1),\n" +
                            "\t('220914', '2209', 'Shapaja', 1),\n" +
                            "\t('221001', '2210', 'Tocache', 1),\n" +
                            "\t('221002', '2210', 'Nuevo Progreso', 1),\n" +
                            "\t('221003', '2210', 'Polvora', 1),\n" +
                            "\t('221004', '2210', 'Shunte', 1),\n" +
                            "\t('221005', '2210', 'Uchiza', 1),\n" +
                            "\t('230101', '2301', 'Tacna', 1),\n" +
                            "\t('230102', '2301', 'Alto de la Alianza', 1),\n" +
                            "\t('230103', '2301', 'Calana', 1),\n" +
                            "\t('230104', '2301', 'Ciudad Nueva', 1),\n" +
                            "\t('230105', '2301', 'Inclan', 1),\n" +
                            "\t('230106', '2301', 'Pachia', 1),\n" +
                            "\t('230107', '2301', 'Palca', 1),\n" +
                            "\t('230108', '2301', 'Pocollay', 1),\n" +
                            "\t('230109', '2301', 'Sama', 1),\n" +
                            "\t('230110', '2301', 'Coronel Gregorio Albarracín Lanchipa', 1),\n" +
                            "\t('230111', '2301', 'La Yarada los Palos', 1),\n" +
                            "\t('230201', '2302', 'Candarave', 1),\n" +
                            "\t('230202', '2302', 'Cairani', 1),\n" +
                            "\t('230203', '2302', 'Camilaca', 1),\n" +
                            "\t('230204', '2302', 'Curibaya', 1),\n" +
                            "\t('230205', '2302', 'Huanuara', 1),\n" +
                            "\t('230206', '2302', 'Quilahuani', 1),\n" +
                            "\t('230301', '2303', 'Locumba', 1),\n" +
                            "\t('230302', '2303', 'Ilabaya', 1),\n" +
                            "\t('230303', '2303', 'Ite', 1),\n" +
                            "\t('230401', '2304', 'Tarata', 1),\n" +
                            "\t('230402', '2304', 'Héroes Albarracín', 1),\n" +
                            "\t('230403', '2304', 'Estique', 1),\n" +
                            "\t('230404', '2304', 'Estique-Pampa', 1),\n" +
                            "\t('230405', '2304', 'Sitajara', 1),\n" +
                            "\t('230406', '2304', 'Susapaya', 1),\n" +
                            "\t('230407', '2304', 'Tarucachi', 1),\n" +
                            "\t('230408', '2304', 'Ticaco', 1),\n" +
                            "\t('240101', '2401', 'Tumbes', 1),\n" +
                            "\t('240102', '2401', 'Corrales', 1),\n" +
                            "\t('240103', '2401', 'La Cruz', 1),\n" +
                            "\t('240104', '2401', 'Pampas de Hospital', 1),\n" +
                            "\t('240105', '2401', 'San Jacinto', 1),\n" +
                            "\t('240106', '2401', 'San Juan de la Virgen', 1),\n" +
                            "\t('240201', '2402', 'Zorritos', 1),\n" +
                            "\t('240202', '2402', 'Casitas', 1),\n" +
                            "\t('240203', '2402', 'Canoas de Punta Sal', 1),\n" +
                            "\t('240301', '2403', 'Zarumilla', 1),\n" +
                            "\t('240302', '2403', 'Aguas Verdes', 1),\n" +
                            "\t('240303', '2403', 'Matapalo', 1),\n" +
                            "\t('240304', '2403', 'Papayal', 1),\n" +
                            "\t('250101', '2501', 'Calleria', 1),\n" +
                            "\t('250102', '2501', 'Campoverde', 1),\n" +
                            "\t('250103', '2501', 'Iparia', 1),\n" +
                            "\t('250104', '2501', 'Masisea', 1),\n" +
                            "\t('250105', '2501', 'Yarinacocha', 1),\n" +
                            "\t('250106', '2501', 'Nueva Requena', 1),\n" +
                            "\t('250107', '2501', 'Manantay', 1),\n" +
                            "\t('250201', '2502', 'Raymondi', 1),\n" +
                            "\t('250202', '2502', 'Sepahua', 1),\n" +
                            "\t('250203', '2502', 'Tahuania', 1),\n" +
                            "\t('250204', '2502', 'Yurua', 1),\n" +
                            "\t('250301', '2503', 'Padre Abad', 1),\n" +
                            "\t('250302', '2503', 'Irazola', 1),\n" +
                            "\t('250303', '2503', 'Curimana', 1),\n" +
                            "\t('250304', '2503', 'Neshuya', 1),\n" +
                            "\t('250305', '2503', 'Alexander Von Humboldt', 1),\n" +
                            "\t('250401', '2504', 'Purus', 1);"
            };

    public static String tablaDistritoDatos[] =
            {
                    "INSERT INTO `distrito` (`codigo_distrito`, `codigo_provincia`, `nombre`, `estado`) VALUES\n" +
                            "\t('010101', '0101', 'Chachapoyas', 1),\n" +
                            "\t('010102', '0101', 'Asunción', 1),\n" +
                            "\t('010103', '0101', 'Balsas', 1),\n" +
                            "\t('010104', '0101', 'Cheto', 1),\n" +
                            "\t('010105', '0101', 'Chiliquin', 1),\n" +
                            "\t('010106', '0101', 'Chuquibamba', 1),\n" +
                            "\t('010107', '0101', 'Granada', 1),\n" +
                            "\t('010108', '0101', 'Huancas', 1),\n" +
                            "\t('010109', '0101', 'La Jalca', 1),\n" +
                            "\t('010110', '0101', 'Leimebamba', 1),\n" +
                            "\t('010111', '0101', 'Levanto', 1),\n" +
                            "\t('010112', '0101', 'Magdalena', 1),\n" +
                            "\t('010113', '0101', 'Mariscal Castilla', 1),\n" +
                            "\t('010114', '0101', 'Molinopampa', 1),\n" +
                            "\t('010115', '0101', 'Montevideo', 1),\n" +
                            "\t('010116', '0101', 'Olleros', 1),\n" +
                            "\t('010117', '0101', 'Quinjalca', 1),\n" +
                            "\t('010118', '0101', 'San Francisco de Daguas', 1),\n" +
                            "\t('010119', '0101', 'San Isidro de Maino', 1),\n" +
                            "\t('010120', '0101', 'Soloco', 1),\n" +
                            "\t('010121', '0101', 'Sonche', 1),\n" +
                            "\t('010201', '0102', 'Bagua', 1),\n" +
                            "\t('010202', '0102', 'Aramango', 1),\n" +
                            "\t('010203', '0102', 'Copallin', 1),\n" +
                            "\t('010204', '0102', 'El Parco', 1),\n" +

                            "\t('010205', '0102', 'Imaza', 1) ,\n" +
                            "\t('010206', '0102', 'La Peca', 1),\n" +
                            "\t('010301', '0103', 'Jumbilla', 1),\n" +
                            "\t('010302', '0103', 'Chisquilla', 1),\n" +
                            "\t('010303', '0103', 'Churuja', 1),\n" +
                            "\t('010304', '0103', 'Corosha', 1),\n" +
                            "\t('010305', '0103', 'Cuispes', 1),\n" +
                            "\t('010306', '0103', 'Florida', 1),\n" +
                            "\t('010307', '0103', 'Jazan', 1),\n" +
                            "\t('010308', '0103', 'Recta', 1),\n" +
                            "\t('010309', '0103', 'San Carlos', 1),\n" +
                            "\t('010310', '0103', 'Shipasbamba', 1),\n" +
                            "\t('010311', '0103', 'Valera', 1),\n" +
                            "\t('010312', '0103', 'Yambrasbamba', 1),\n" +
                            "\t('010401', '0104', 'Nieva', 1),\n" +
                            "\t('010402', '0104', 'El Cenepa', 1),\n" +
                            "\t('010403', '0104', 'Río Santiago', 1),\n" +
                            "\t('010501', '0105', 'Lamud', 1),\n" +
                            "\t('010502', '0105', 'Camporredondo', 1),\n" +
                            "\t('010503', '0105', 'Cocabamba', 1),\n" +
                            "\t('010504', '0105', 'Colcamar', 1),\n" +
                            "\t('010505', '0105', 'Conila', 1),\n" +
                            "\t('010506', '0105', 'Inguilpata', 1),\n" +
                            "\t('010507', '0105', 'Longuita', 1),\n" +
                            "\t('010508', '0105', 'Lonya Chico', 1),\n" +
                            "\t('010509', '0105', 'Luya', 1),\n" +
                            "\t('010510', '0105', 'Luya Viejo', 1),\n" +
                            "\t('010511', '0105', 'María', 1),\n" +
                            "\t('010512', '0105', 'Ocalli', 1),\n" +
                            "\t('010513', '0105', 'Ocumal', 1),\n" +
                            "\t('010514', '0105', 'Pisuquia', 1),\n" +
                            "\t('010515', '0105', 'Providencia', 1),\n" +
                            "\t('010516', '0105', 'San Cristóbal', 1),\n" +
                            "\t('010517', '0105', 'San Francisco de Yeso', 1),\n" +
                            "\t('010518', '0105', 'San Jerónimo', 1),\n" +
                            "\t('010519', '0105', 'San Juan de Lopecancha', 1),\n" +
                            "\t('010520', '0105', 'Santa Catalina', 1),\n" +
                            "\t('010521', '0105', 'Santo Tomas', 1),\n" +
                            "\t('010522', '0105', 'Tingo', 1),\n" +
                            "\t('010523', '0105', 'Trita', 1),\n" +
                            "\t('010601', '0106', 'San Nicolás', 1),\n" +
                            "\t('010602', '0106', 'Chirimoto', 1),\n" +
                            "\t('010603', '0106', 'Cochamal', 1),\n" +
                            "\t('010604', '0106', 'Huambo', 1),\n" +
                            "\t('010605', '0106', 'Limabamba', 1),\n" +
                            "\t('010606', '0106', 'Longar', 1),\n" +
                            "\t('010607', '0106', 'Mariscal Benavides', 1),\n" +
                            "\t('010608', '0106', 'Milpuc', 1),\n" +
                            "\t('010609', '0106', 'Omia', 1),\n" +
                            "\t('010610', '0106', 'Santa Rosa', 1),\n" +
                            "\t('010611', '0106', 'Totora', 1),\n" +
                            "\t('010612', '0106', 'Vista Alegre', 1),\n" +
                            "\t('010701', '0107', 'Bagua Grande', 1),\n" +
                            "\t('010702', '0107', 'Cajaruro', 1),\n" +
                            "\t('010703', '0107', 'Cumba', 1),\n" +
                            "\t('010704', '0107', 'El Milagro', 1),\n" +
                            "\t('010705', '0107', 'Jamalca', 1),\n" +
                            "\t('010706', '0107', 'Lonya Grande', 1),\n" +
                            "\t('010707', '0107', 'Yamon', 1),\n" +
                            "\t('020101', '0201', 'Huaraz', 1),\n" +
                            "\t('020102', '0201', 'Cochabamba', 1),\n" +
                            "\t('020103', '0201', 'Colcabamba', 1),\n" +
                            "\t('020104', '0201', 'Huanchay', 1),\n" +
                            "\t('020105', '0201', 'Independencia', 1),\n" +
                            "\t('020106', '0201', 'Jangas', 1),\n" +
                            "\t('020107', '0201', 'La Libertad', 1),\n" +
                            "\t('020108', '0201', 'Olleros', 1),\n" +
                            "\t('020109', '0201', 'Pampas Grande', 1),\n" +
                            "\t('020110', '0201', 'Pariacoto', 1),\n" +
                            "\t('020111', '0201', 'Pira', 1),\n" +
                            "\t('020112', '0201', 'Tarica', 1),\n" +
                            "\t('020201', '0202', 'Aija', 1),\n" +
                            "\t('020202', '0202', 'Coris', 1),\n" +
                            "\t('020203', '0202', 'Huacllan', 1),\n" +
                            "\t('020204', '0202', 'La Merced', 1),\n" +
                            "\t('020205', '0202', 'Succha', 1),\n" +
                            "\t('020301', '0203', 'Llamellin', 1),\n" +
                            "\t('020302', '0203', 'Aczo', 1),\n" +
                            "\t('020303', '0203', 'Chaccho', 1),\n" +
                            "\t('020304', '0203', 'Chingas', 1),\n" +
                            "\t('020305', '0203', 'Mirgas', 1),\n" +
                            "\t('020306', '0203', 'San Juan de Rontoy', 1),\n" +
                            "\t('020401', '0204', 'Chacas', 1),\n" +
                            "\t('020402', '0204', 'Acochaca', 1),\n" +
                            "\t('020501', '0205', 'Chiquian', 1),\n" +
                            "\t('020502', '0205', 'Abelardo Pardo Lezameta', 1),\n" +
                            "\t('020503', '0205', 'Antonio Raymondi', 1),\n" +
                            "\t('020504', '0205', 'Aquia', 1),\n" +
                            "\t('020505', '0205', 'Cajacay', 1),\n" +
                            "\t('020506', '0205', 'Canis', 1),\n" +
                            "\t('020507', '0205', 'Colquioc', 1),\n" +
                            "\t('020508', '0205', 'Huallanca', 1),\n" +
                            "\t('020509', '0205', 'Huasta', 1),\n" +
                            "\t('020510', '0205', 'Huayllacayan', 1),\n" +
                            "\t('020511', '0205', 'La Primavera', 1),\n" +
                            "\t('020512', '0205', 'Mangas', 1),\n" +
                            "\t('020513', '0205', 'Pacllon', 1),\n" +
                            "\t('020514', '0205', 'San Miguel de Corpanqui', 1),\n" +
                            "\t('020515', '0205', 'Ticllos', 1),\n" +
                            "\t('020601', '0206', 'Carhuaz', 1),\n" +
                            "\t('020602', '0206', 'Acopampa', 1),\n" +
                            "\t('020603', '0206', 'Amashca', 1),\n" +
                            "\t('020604', '0206', 'Anta', 1),\n" +
                            "\t('020605', '0206', 'Ataquero', 1),\n" +
                            "\t('020606', '0206', 'Marcara', 1),\n" +
                            "\t('020607', '0206', 'Pariahuanca', 1),\n" +
                            "\t('020608', '0206', 'San Miguel de Aco', 1),\n" +
                            "\t('020609', '0206', 'Shilla', 1),\n" +
                            "\t('020610', '0206', 'Tinco', 1),\n" +
                            "\t('020611', '0206', 'Yungar', 1),\n" +
                            "\t('020701', '0207', 'San Luis', 1),\n" +
                            "\t('020702', '0207', 'San Nicolás', 1),\n" +
                            "\t('020703', '0207', 'Yauya', 1),\n" +
                            "\t('020801', '0208', 'Casma', 1),\n" +
                            "\t('020802', '0208', 'Buena Vista Alta', 1),\n" +
                            "\t('020803', '0208', 'Comandante Noel', 1),\n" +
                            "\t('020804', '0208', 'Yautan', 1),\n" +
                            "\t('020901', '0209', 'Corongo', 1),\n" +
                            "\t('020902', '0209', 'Aco', 1),\n" +
                            "\t('020903', '0209', 'Bambas', 1),\n" +
                            "\t('020904', '0209', 'Cusca', 1),\n" +
                            "\t('020905', '0209', 'La Pampa', 1),\n" +
                            "\t('020906', '0209', 'Yanac', 1),\n" +
                            "\t('020907', '0209', 'Yupan', 1),\n" +
                            "\t('021001', '0210', 'Huari', 1),\n" +
                            "\t('021002', '0210', 'Anra', 1),\n" +
                            "\t('021003', '0210', 'Cajay', 1),\n" +
                            "\t('021004', '0210', 'Chavin de Huantar', 1),\n" +
                            "\t('021005', '0210', 'Huacachi', 1),\n" +
                            "\t('021006', '0210', 'Huacchis', 1),\n" +
                            "\t('021007', '0210', 'Huachis', 1),\n" +
                            "\t('021008', '0210', 'Huantar', 1),\n" +
                            "\t('021009', '0210', 'Masin', 1),\n" +
                            "\t('021010', '0210', 'Paucas', 1),\n" +
                            "\t('021011', '0210', 'Ponto', 1),\n" +
                            "\t('021012', '0210', 'Rahuapampa', 1),\n" +
                            "\t('021013', '0210', 'Rapayan', 1),\n" +
                            "\t('021014', '0210', 'San Marcos', 1),\n" +
                            "\t('021015', '0210', 'San Pedro de Chana', 1),\n" +
                            "\t('021016', '0210', 'Uco', 1),\n" +
                            "\t('021101', '0211', 'Huarmey', 1),\n" +
                            "\t('021102', '0211', 'Cochapeti', 1),\n" +
                            "\t('021103', '0211', 'Culebras', 1),\n" +
                            "\t('021104', '0211', 'Huayan', 1),\n" +
                            "\t('021105', '0211', 'Malvas', 1),\n" +
                            "\t('021201', '0212', 'Caraz', 1),\n" +
                            "\t('021202', '0212', 'Huallanca', 1),\n" +
                            "\t('021203', '0212', 'Huata', 1),\n" +
                            "\t('021204', '0212', 'Huaylas', 1),\n" +
                            "\t('021205', '0212', 'Mato', 1),\n" +
                            "\t('021206', '0212', 'Pamparomas', 1),\n" +
                            "\t('021207', '0212', 'Pueblo Libre', 1),\n" +
                            "\t('021208', '0212', 'Santa Cruz', 1),\n" +
                            "\t('021209', '0212', 'Santo Toribio', 1),\n" +
                            "\t('021210', '0212', 'Yuracmarca', 1),\n" +
                            "\t('021301', '0213', 'Piscobamba', 1),\n" +
                            "\t('021302', '0213', 'Casca', 1),\n" +
                            "\t('021303', '0213', 'Eleazar Guzmán Barron', 1),\n" +
                            "\t('021304', '0213', 'Fidel Olivas Escudero', 1),\n" +
                            "\t('021305', '0213', 'Llama', 1),\n" +
                            "\t('021306', '0213', 'Llumpa', 1),\n" +
                            "\t('021307', '0213', 'Lucma', 1),\n" +
                            "\t('021308', '0213', 'Musga', 1),\n" +
                            "\t('021401', '0214', 'Ocros', 1),\n" +
                            "\t('021402', '0214', 'Acas', 1),\n" +
                            "\t('021403', '0214', 'Cajamarquilla', 1),\n" +
                            "\t('021404', '0214', 'Carhuapampa', 1),\n" +
                            "\t('021405', '0214', 'Cochas', 1),\n" +
                            "\t('021406', '0214', 'Congas', 1),\n" +
                            "\t('021407', '0214', 'Llipa', 1),\n" +
                            "\t('021408', '0214', 'San Cristóbal de Rajan', 1),\n" +
                            "\t('021409', '0214', 'San Pedro', 1),\n" +
                            "\t('021410', '0214', 'Santiago de Chilcas', 1),\n" +
                            "\t('021501', '0215', 'Cabana', 1),\n" +
                            "\t('021502', '0215', 'Bolognesi', 1),\n" +
                            "\t('021503', '0215', 'Conchucos', 1),\n" +
                            "\t('021504', '0215', 'Huacaschuque', 1),\n" +
                            "\t('021505', '0215', 'Huandoval', 1),\n" +
                            "\t('021506', '0215', 'Lacabamba', 1),\n" +
                            "\t('021507', '0215', 'Llapo', 1),\n" +
                            "\t('021508', '0215', 'Pallasca', 1),\n" +
                            "\t('021509', '0215', 'Pampas', 1),\n" +
                            "\t('021510', '0215', 'Santa Rosa', 1),\n" +
                            "\t('021511', '0215', 'Tauca', 1),\n" +
                            "\t('021601', '0216', 'Pomabamba', 1),\n" +
                            "\t('021602', '0216', 'Huayllan', 1),\n" +
                            "\t('021603', '0216', 'Parobamba', 1),\n" +
                            "\t('021604', '0216', 'Quinuabamba', 1),\n" +
                            "\t('021701', '0217', 'Recuay', 1),\n" +
                            "\t('021702', '0217', 'Catac', 1),\n" +
                            "\t('021703', '0217', 'Cotaparaco', 1),\n" +
                            "\t('021704', '0217', 'Huayllapampa', 1),\n" +
                            "\t('021705', '0217', 'Llacllin', 1),\n" +
                            "\t('021706', '0217', 'Marca', 1),\n" +
                            "\t('021707', '0217', 'Pampas Chico', 1),\n" +
                            "\t('021708', '0217', 'Pararin', 1),\n" +
                            "\t('021709', '0217', 'Tapacocha', 1),\n" +
                            "\t('021710', '0217', 'Ticapampa', 1),\n" +
                            "\t('021801', '0218', 'Chimbote', 1),\n" +
                            "\t('021802', '0218', 'Cáceres del Perú', 1),\n" +
                            "\t('021803', '0218', 'Coishco', 1),\n" +
                            "\t('021804', '0218', 'Macate', 1),\n" +
                            "\t('021805', '0218', 'Moro', 1),\n" +
                            "\t('021806', '0218', 'Nepeña', 1),\n" +
                            "\t('021807', '0218', 'Samanco', 1),\n" +
                            "\t('021808', '0218', 'Santa', 1),\n" +
                            "\t('021809', '0218', 'Nuevo Chimbote', 1),\n" +
                            "\t('021901', '0219', 'Sihuas', 1),\n" +
                            "\t('021902', '0219', 'Acobamba', 1),\n" +
                            "\t('021903', '0219', 'Alfonso Ugarte', 1),\n" +
                            "\t('021904', '0219', 'Cashapampa', 1),\n" +
                            "\t('021905', '0219', 'Chingalpo', 1),\n" +
                            "\t('021906', '0219', 'Huayllabamba', 1),\n" +
                            "\t('021907', '0219', 'Quiches', 1),\n" +
                            "\t('021908', '0219', 'Ragash', 1),\n" +
                            "\t('021909', '0219', 'San Juan', 1),\n" +
                            "\t('021910', '0219', 'Sicsibamba', 1),\n" +
                            "\t('022001', '0220', 'Yungay', 1),\n" +
                            "\t('022002', '0220', 'Cascapara', 1),\n" +
                            "\t('022003', '0220', 'Mancos', 1),\n" +
                            "\t('022004', '0220', 'Matacoto', 1),\n" +
                            "\t('022005', '0220', 'Quillo', 1),\n" +
                            "\t('022006', '0220', 'Ranrahirca', 1),\n" +
                            "\t('022007', '0220', 'Shupluy', 1),\n" +
                            "\t('022008', '0220', 'Yanama', 1),\n" +
                            "\t('030101', '0301', 'Abancay', 1),\n" +
                            "\t('030102', '0301', 'Chacoche', 1),\n" +
                            "\t('030103', '0301', 'Circa', 1),\n" +
                            "\t('030104', '0301', 'Curahuasi', 1),\n" +
                            "\t('030105', '0301', 'Huanipaca', 1),\n" +
                            "\t('030106', '0301', 'Lambrama', 1),\n" +
                            "\t('030107', '0301', 'Pichirhua', 1),\n" +
                            "\t('030108', '0301', 'San Pedro de Cachora', 1),\n" +
                            "\t('030109', '0301', 'Tamburco', 1),\n" +
                            "\t('030201', '0302', 'Andahuaylas', 1),\n" +
                            "\t('030202', '0302', 'Andarapa', 1),\n" +
                            "\t('030203', '0302', 'Chiara', 1),\n" +
                            "\t('030204', '0302', 'Huancarama', 1),\n" +
                            "\t('030205', '0302', 'Huancaray', 1),\n" +
                            "\t('030206', '0302', 'Huayana', 1),\n" +
                            "\t('030207', '0302', 'Kishuara', 1),\n" +
                            "\t('030208', '0302', 'Pacobamba', 1),\n" +
                            "\t('030209', '0302', 'Pacucha', 1),\n" +
                            "\t('030210', '0302', 'Pampachiri', 1),\n" +
                            "\t('030211', '0302', 'Pomacocha', 1),\n" +
                            "\t('030212', '0302', 'San Antonio de Cachi', 1),\n" +
                            "\t('030213', '0302', 'San Jerónimo', 1),\n" +
                            "\t('030214', '0302', 'San Miguel de Chaccrampa', 1),\n" +
                            "\t('030215', '0302', 'Santa María de Chicmo', 1),\n" +
                            "\t('030216', '0302', 'Talavera', 1),\n" +
                            "\t('030217', '0302', 'Tumay Huaraca', 1),\n" +
                            "\t('030218', '0302', 'Turpo', 1),\n" +
                            "\t('030219', '0302', 'Kaquiabamba', 1),\n" +
                            "\t('030220', '0302', 'José María Arguedas', 1),\n" +
                            "\t('030301', '0303', 'Antabamba', 1),\n" +
                            "\t('030302', '0303', 'El Oro', 1),\n" +
                            "\t('030303', '0303', 'Huaquirca', 1),\n" +
                            "\t('030304', '0303', 'Juan Espinoza Medrano', 1),\n" +
                            "\t('030305', '0303', 'Oropesa', 1),\n" +
                            "\t('030306', '0303', 'Pachaconas', 1),\n" +
                            "\t('030307', '0303', 'Sabaino', 1),\n" +
                            "\t('030401', '0304', 'Chalhuanca', 1),\n" +
                            "\t('030402', '0304', 'Capaya', 1),\n" +
                            "\t('030403', '0304', 'Caraybamba', 1),\n" +
                            "\t('030404', '0304', 'Chapimarca', 1),\n" +
                            "\t('030405', '0304', 'Colcabamba', 1),\n" +
                            "\t('030406', '0304', 'Cotaruse', 1),\n" +
                            "\t('030407', '0304', 'Ihuayllo', 1),\n" +
                            "\t('030408', '0304', 'Justo Apu Sahuaraura', 1),\n" +
                            "\t('030409', '0304', 'Lucre', 1),\n" +
                            "\t('030410', '0304', 'Pocohuanca', 1),\n" +
                            "\t('030411', '0304', 'San Juan de Chacña', 1),\n" +
                            "\t('030412', '0304', 'Sañayca', 1),\n" +
                            "\t('030413', '0304', 'Soraya', 1),\n" +
                            "\t('030414', '0304', 'Tapairihua', 1),\n" +
                            "\t('030415', '0304', 'Tintay', 1),\n" +
                            "\t('030416', '0304', 'Toraya', 1),\n" +
                            "\t('030417', '0304', 'Yanaca', 1),\n" +
                            "\t('030501', '0305', 'Tambobamba', 1),\n" +
                            "\t('030502', '0305', 'Cotabambas', 1),\n" +
                            "\t('030503', '0305', 'Coyllurqui', 1),\n" +
                            "\t('030504', '0305', 'Haquira', 1),\n" +
                            "\t('030505', '0305', 'Mara', 1),\n" +
                            "\t('030506', '0305', 'Challhuahuacho', 1),\n" +
                            "\t('030601', '0306', 'Chincheros', 1),\n" +
                            "\t('030602', '0306', 'Anco_Huallo', 1),\n" +
                            "\t('030603', '0306', 'Cocharcas', 1),\n" +
                            "\t('030604', '0306', 'Huaccana', 1),\n" +
                            "\t('030605', '0306', 'Ocobamba', 1),\n" +
                            "\t('030606', '0306', 'Ongoy', 1),\n" +
                            "\t('030607', '0306', 'Uranmarca', 1),\n" +
                            "\t('030608', '0306', 'Ranracancha', 1),\n" +
                            "\t('030609', '0306', 'Rocchacc', 1),\n" +
                            "\t('030610', '0306', 'El Porvenir', 1),\n" +
                            "\t('030701', '0307', 'Chuquibambilla', 1),\n" +
                            "\t('030702', '0307', 'Curpahuasi', 1),\n" +
                            "\t('030703', '0307', 'Gamarra', 1),\n" +
                            "\t('030704', '0307', 'Huayllati', 1),\n" +
                            "\t('030705', '0307', 'Mamara', 1),\n" +
                            "\t('030706', '0307', 'Micaela Bastidas', 1),\n" +
                            "\t('030707', '0307', 'Pataypampa', 1),\n" +
                            "\t('030708', '0307', 'Progreso', 1),\n" +
                            "\t('030709', '0307', 'San Antonio', 1),\n" +
                            "\t('030710', '0307', 'Santa Rosa', 1),\n" +
                            "\t('030711', '0307', 'Turpay', 1),\n" +
                            "\t('030712', '0307', 'Vilcabamba', 1),\n" +
                            "\t('030713', '0307', 'Virundo', 1),\n" +
                            "\t('030714', '0307', 'Curasco', 1),\n" +
                            "\t('040101', '0401', 'Arequipa', 1),\n" +
                            "\t('040102', '0401', 'Alto Selva Alegre', 1),\n" +
                            "\t('040103', '0401', 'Cayma', 1),\n" +
                            "\t('040104', '0401', 'Cerro Colorado', 1),\n" +
                            "\t('040105', '0401', 'Characato', 1),\n" +
                            "\t('040106', '0401', 'Chiguata', 1),\n" +
                            "\t('040107', '0401', 'Jacobo Hunter', 1),\n" +
                            "\t('040108', '0401', 'La Joya', 1),\n" +
                            "\t('040109', '0401', 'Mariano Melgar', 1),\n" +
                            "\t('040110', '0401', 'Miraflores', 1),\n" +
                            "\t('040111', '0401', 'Mollebaya', 1),\n" +
                            "\t('040112', '0401', 'Paucarpata', 1),\n" +
                            "\t('040113', '0401', 'Pocsi', 1),\n" +
                            "\t('040114', '0401', 'Polobaya', 1),\n" +
                            "\t('040115', '0401', 'Quequeña', 1),\n" +
                            "\t('040116', '0401', 'Sabandia', 1),\n" +
                            "\t('040117', '0401', 'Sachaca', 1),\n" +
                            "\t('040118', '0401', 'San Juan de Siguas', 1),\n" +
                            "\t('040119', '0401', 'San Juan de Tarucani', 1),\n" +
                            "\t('040120', '0401', 'Santa Isabel de Siguas', 1),\n" +
                            "\t('040121', '0401', 'Santa Rita de Siguas', 1),\n" +
                            "\t('040122', '0401', 'Socabaya', 1),\n" +
                            "\t('040123', '0401', 'Tiabaya', 1),\n" +
                            "\t('040124', '0401', 'Uchumayo', 1),\n" +
                            "\t('040125', '0401', 'Vitor', 1),\n" +
                            "\t('040126', '0401', 'Yanahuara', 1),\n" +
                            "\t('040127', '0401', 'Yarabamba', 1),\n" +
                            "\t('040128', '0401', 'Yura', 1),\n" +
                            "\t('040129', '0401', 'José Luis Bustamante Y Rivero', 1),\n" +
                            "\t('040201', '0402', 'Camaná', 1),\n" +
                            "\t('040202', '0402', 'José María Quimper', 1),\n" +
                            "\t('040203', '0402', 'Mariano Nicolás Valcárcel', 1),\n" +
                            "\t('040204', '0402', 'Mariscal Cáceres', 1),\n" +
                            "\t('040205', '0402', 'Nicolás de Pierola', 1),\n" +
                            "\t('040206', '0402', 'Ocoña', 1),\n" +
                            "\t('040207', '0402', 'Quilca', 1),\n" +
                            "\t('040208', '0402', 'Samuel Pastor', 1),\n" +
                            "\t('040301', '0403', 'Caravelí', 1),\n" +
                            "\t('040302', '0403', 'Acarí', 1),\n" +
                            "\t('040303', '0403', 'Atico', 1),\n" +
                            "\t('040304', '0403', 'Atiquipa', 1),\n" +
                            "\t('040305', '0403', 'Bella Unión', 1),\n" +
                            "\t('040306', '0403', 'Cahuacho', 1),\n" +
                            "\t('040307', '0403', 'Chala', 1),\n" +
                            "\t('040308', '0403', 'Chaparra', 1),\n" +
                            "\t('040309', '0403', 'Huanuhuanu', 1),\n" +
                            "\t('040310', '0403', 'Jaqui', 1),\n" +
                            "\t('040311', '0403', 'Lomas', 1),\n" +
                            "\t('040312', '0403', 'Quicacha', 1),\n" +
                            "\t('040313', '0403', 'Yauca', 1),\n" +
                            "\t('040401', '0404', 'Aplao', 1),\n" +
                            "\t('040402', '0404', 'Andagua', 1),\n" +
                            "\t('040403', '0404', 'Ayo', 1),\n" +
                            "\t('040404', '0404', 'Chachas', 1),\n" +
                            "\t('040405', '0404', 'Chilcaymarca', 1),\n" +
                            "\t('040406', '0404', 'Choco', 1),\n" +
                            "\t('040407', '0404', 'Huancarqui', 1),\n" +
                            "\t('040408', '0404', 'Machaguay', 1),\n" +
                            "\t('040409', '0404', 'Orcopampa', 1),\n" +
                            "\t('040410', '0404', 'Pampacolca', 1),\n" +
                            "\t('040411', '0404', 'Tipan', 1),\n" +
                            "\t('040412', '0404', 'Uñon', 1),\n" +
                            "\t('040413', '0404', 'Uraca', 1),\n" +
                            "\t('040414', '0404', 'Viraco', 1),\n" +
                            "\t('040501', '0405', 'Chivay', 1),\n" +
                            "\t('040502', '0405', 'Achoma', 1),\n" +
                            "\t('040503', '0405', 'Cabanaconde', 1),\n" +
                            "\t('040504', '0405', 'Callalli', 1),\n" +
                            "\t('040505', '0405', 'Caylloma', 1),\n" +
                            "\t('040506', '0405', 'Coporaque', 1),\n" +
                            "\t('040507', '0405', 'Huambo', 1),\n" +
                            "\t('040508', '0405', 'Huanca', 1),\n" +
                            "\t('040509', '0405', 'Ichupampa', 1),\n" +
                            "\t('040510', '0405', 'Lari', 1),\n" +
                            "\t('040511', '0405', 'Lluta', 1),\n" +
                            "\t('040512', '0405', 'Maca', 1),\n" +
                            "\t('040513', '0405', 'Madrigal', 1),\n" +
                            "\t('040514', '0405', 'San Antonio de Chuca', 1),\n" +
                            "\t('040515', '0405', 'Sibayo', 1),\n" +
                            "\t('040516', '0405', 'Tapay', 1),\n" +
                            "\t('040517', '0405', 'Tisco', 1),\n" +
                            "\t('040518', '0405', 'Tuti', 1),\n" +
                            "\t('040519', '0405', 'Yanque', 1),\n" +
                            "\t('040520', '0405', 'Majes', 1),\n" +
                            "\t('040601', '0406', 'Chuquibamba', 1),\n" +
                            "\t('040602', '0406', 'Andaray', 1),\n" +
                            "\t('040603', '0406', 'Cayarani', 1),\n" +
                            "\t('040604', '0406', 'Chichas', 1),\n" +
                            "\t('040605', '0406', 'Iray', 1),\n" +
                            "\t('040606', '0406', 'Río Grande', 1),\n" +
                            "\t('040607', '0406', 'Salamanca', 1),\n" +
                            "\t('040608', '0406', 'Yanaquihua', 1),\n" +
                            "\t('040701', '0407', 'Mollendo', 1),\n" +
                            "\t('040702', '0407', 'Cocachacra', 1),\n" +
                            "\t('040703', '0407', 'Dean Valdivia', 1),\n" +
                            "\t('040704', '0407', 'Islay', 1),\n" +
                            "\t('040705', '0407', 'Mejia', 1),\n" +
                            "\t('040706', '0407', 'Punta de Bombón', 1),\n" +
                            "\t('040801', '0408', 'Cotahuasi', 1),\n" +
                            "\t('040802', '0408', 'Alca', 1),\n" +
                            "\t('040803', '0408', 'Charcana', 1),\n" +
                            "\t('040804', '0408', 'Huaynacotas', 1),\n" +
                            "\t('040805', '0408', 'Pampamarca', 1),\n" +
                            "\t('040806', '0408', 'Puyca', 1),\n" +
                            "\t('040807', '0408', 'Quechualla', 1),\n" +
                            "\t('040808', '0408', 'Sayla', 1),\n" +
                            "\t('040809', '0408', 'Tauria', 1),\n" +
                            "\t('040810', '0408', 'Tomepampa', 1),\n" +
                            "\t('040811', '0408', 'Toro', 1),\n" +
                            "\t('050101', '0501', 'Ayacucho', 1),\n" +
                            "\t('050102', '0501', 'Acocro', 1),\n" +
                            "\t('050103', '0501', 'Acos Vinchos', 1),\n" +
                            "\t('050104', '0501', 'Carmen Alto', 1),\n" +
                            "\t('050105', '0501', 'Chiara', 1),\n" +
                            "\t('050106', '0501', 'Ocros', 1),\n" +
                            "\t('050107', '0501', 'Pacaycasa', 1),\n" +
                            "\t('050108', '0501', 'Quinua', 1),\n" +
                            "\t('050109', '0501', 'San José de Ticllas', 1),\n" +
                            "\t('050110', '0501', 'San Juan Bautista', 1),\n" +
                            "\t('050111', '0501', 'Santiago de Pischa', 1),\n" +
                            "\t('050112', '0501', 'Socos', 1),\n" +
                            "\t('050113', '0501', 'Tambillo', 1),\n" +
                            "\t('050114', '0501', 'Vinchos', 1),\n" +
                            "\t('050115', '0501', 'Jesús Nazareno', 1),\n" +
                            "\t('050116', '0501', 'Andrés Avelino Cáceres Dorregaray', 1),\n" +
                            "\t('050201', '0502', 'Cangallo', 1),\n" +
                            "\t('050202', '0502', 'Chuschi', 1),\n" +
                            "\t('050203', '0502', 'Los Morochucos', 1),\n" +
                            "\t('050204', '0502', 'María Parado de Bellido', 1),\n" +
                            "\t('050205', '0502', 'Paras', 1),\n" +
                            "\t('050206', '0502', 'Totos', 1),\n" +
                            "\t('050301', '0503', 'Sancos', 1),\n" +
                            "\t('050302', '0503', 'Carapo', 1),\n" +
                            "\t('050303', '0503', 'Sacsamarca', 1),\n" +
                            "\t('050304', '0503', 'Santiago de Lucanamarca', 1),\n" +
                            "\t('050401', '0504', 'Huanta', 1),\n" +
                            "\t('050402', '0504', 'Ayahuanco', 1),\n" +
                            "\t('050403', '0504', 'Huamanguilla', 1),\n" +
                            "\t('050404', '0504', 'Iguain', 1),\n" +
                            "\t('050405', '0504', 'Luricocha', 1),\n" +
                            "\t('050406', '0504', 'Santillana', 1),\n" +
                            "\t('050407', '0504', 'Sivia', 1),\n" +
                            "\t('050408', '0504', 'Llochegua', 1),\n" +
                            "\t('050409', '0504', 'Canayre', 1),\n" +
                            "\t('050410', '0504', 'Uchuraccay', 1),\n" +
                            "\t('050411', '0504', 'Pucacolpa', 1),\n" +
                            "\t('050412', '0504', 'Chaca', 1),\n" +
                            "\t('050501', '0505', 'San Miguel', 1),\n" +
                            "\t('050502', '0505', 'Anco', 1),\n" +
                            "\t('050503', '0505', 'Ayna', 1),\n" +
                            "\t('050504', '0505', 'Chilcas', 1),\n" +
                            "\t('050505', '0505', 'Chungui', 1),\n" +
                            "\t('050506', '0505', 'Luis Carranza', 1),\n" +
                            "\t('050507', '0505', 'Santa Rosa', 1),\n" +
                            "\t('050508', '0505', 'Tambo', 1),\n" +
                            "\t('050509', '0505', 'Samugari', 1),\n" +
                            "\t('050510', '0505', 'Anchihuay', 1),\n" +
                            "\t('050601', '0506', 'Puquio', 1),\n" +
                            "\t('050602', '0506', 'Aucara', 1),\n" +
                            "\t('050603', '0506', 'Cabana', 1),\n" +
                            "\t('050604', '0506', 'Carmen Salcedo', 1),\n" +
                            "\t('050605', '0506', 'Chaviña', 1),\n" +
                            "\t('050606', '0506', 'Chipao', 1),\n" +
                            "\t('050607', '0506', 'Huac-Huas', 1),\n" +
                            "\t('050608', '0506', 'Laramate', 1),\n" +
                            "\t('050609', '0506', 'Leoncio Prado', 1),\n" +
                            "\t('050610', '0506', 'Llauta', 1),\n" +
                            "\t('050611', '0506', 'Lucanas', 1),\n" +
                            "\t('050612', '0506', 'Ocaña', 1),\n" +
                            "\t('050613', '0506', 'Otoca', 1),\n" +
                            "\t('050614', '0506', 'Saisa', 1),\n" +
                            "\t('050615', '0506', 'San Cristóbal', 1),\n" +
                            "\t('050616', '0506', 'San Juan', 1),\n" +
                            "\t('050617', '0506', 'San Pedro', 1),\n" +
                            "\t('050618', '0506', 'San Pedro de Palco', 1),\n" +
                            "\t('050619', '0506', 'Sancos', 1),\n" +
                            "\t('050620', '0506', 'Santa Ana de Huaycahuacho', 1),\n" +
                            "\t('050621', '0506', 'Santa Lucia', 1),\n" +
                            "\t('050701', '0507', 'Coracora', 1),\n" +
                            "\t('050702', '0507', 'Chumpi', 1),\n" +
                            "\t('050703', '0507', 'Coronel Castañeda', 1),\n" +
                            "\t('050704', '0507', 'Pacapausa', 1),\n" +
                            "\t('050705', '0507', 'Pullo', 1),\n" +
                            "\t('050706', '0507', 'Puyusca', 1),\n" +
                            "\t('050707', '0507', 'San Francisco de Ravacayco', 1),\n" +
                            "\t('050708', '0507', 'Upahuacho', 1),\n" +
                            "\t('050801', '0508', 'Pausa', 1),\n" +
                            "\t('050802', '0508', 'Colta', 1),\n" +
                            "\t('050803', '0508', 'Corculla', 1),\n" +
                            "\t('050804', '0508', 'Lampa', 1),\n" +
                            "\t('050805', '0508', 'Marcabamba', 1),\n" +
                            "\t('050806', '0508', 'Oyolo', 1),\n" +
                            "\t('050807', '0508', 'Pararca', 1),\n" +
                            "\t('050808', '0508', 'San Javier de Alpabamba', 1),\n" +
                            "\t('050809', '0508', 'San José de Ushua', 1),\n" +
                            "\t('050810', '0508', 'Sara Sara', 1),\n" +
                            "\t('050901', '0509', 'Querobamba', 1),\n" +
                            "\t('050902', '0509', 'Belén', 1),\n" +
                            "\t('050903', '0509', 'Chalcos', 1),\n" +
                            "\t('050904', '0509', 'Chilcayoc', 1),\n" +
                            "\t('050905', '0509', 'Huacaña', 1),\n" +
                            "\t('050906', '0509', 'Morcolla', 1),\n" +
                            "\t('050907', '0509', 'Paico', 1),\n" +
                            "\t('050908', '0509', 'San Pedro de Larcay', 1),\n" +
                            "\t('050909', '0509', 'San Salvador de Quije', 1),\n" +
                            "\t('050910', '0509', 'Santiago de Paucaray', 1),\n" +
                            "\t('050911', '0509', 'Soras', 1),\n" +
                            "\t('051001', '0510', 'Huancapi', 1),\n" +
                            "\t('051002', '0510', 'Alcamenca', 1),\n" +
                            "\t('051003', '0510', 'Apongo', 1),\n" +
                            "\t('051004', '0510', 'Asquipata', 1),\n" +
                            "\t('051005', '0510', 'Canaria', 1),\n" +
                            "\t('051006', '0510', 'Cayara', 1),\n" +
                            "\t('051007', '0510', 'Colca', 1),\n" +
                            "\t('051008', '0510', 'Huamanquiquia', 1),\n" +
                            "\t('051009', '0510', 'Huancaraylla', 1),\n" +
                            "\t('051010', '0510', 'Huaya', 1),\n" +
                            "\t('051011', '0510', 'Sarhua', 1),\n" +
                            "\t('051012', '0510', 'Vilcanchos', 1),\n" +
                            "\t('051101', '0511', 'Vilcas Huaman', 1),\n" +
                            "\t('051102', '0511', 'Accomarca', 1),\n" +
                            "\t('051103', '0511', 'Carhuanca', 1),\n" +
                            "\t('051104', '0511', 'Concepción', 1),\n" +
                            "\t('051105', '0511', 'Huambalpa', 1),\n" +
                            "\t('051106', '0511', 'Independencia', 1),\n" +
                            "\t('051107', '0511', 'Saurama', 1),\n" +
                            "\t('051108', '0511', 'Vischongo', 1),\n" +
                            "\t('060101', '0601', 'Cajamarca', 1),\n" +
                            "\t('060102', '0601', 'Asunción', 1),\n" +
                            "\t('060103', '0601', 'Chetilla', 1),\n" +
                            "\t('060104', '0601', 'Cospan', 1),\n" +
                            "\t('060105', '0601', 'Encañada', 1),\n" +
                            "\t('060106', '0601', 'Jesús', 1),\n" +
                            "\t('060107', '0601', 'Llacanora', 1),\n" +
                            "\t('060108', '0601', 'Los Baños del Inca', 1),\n" +
                            "\t('060109', '0601', 'Magdalena', 1),\n" +
                            "\t('060110', '0601', 'Matara', 1),\n" +
                            "\t('060111', '0601', 'Namora', 1),\n" +
                            "\t('060112', '0601', 'San Juan', 1),\n" +
                            "\t('060201', '0602', 'Cajabamba', 1),\n" +
                            "\t('060202', '0602', 'Cachachi', 1),\n" +
                            "\t('060203', '0602', 'Condebamba', 1),\n" +
                            "\t('060204', '0602', 'Sitacocha', 1),\n" +
                            "\t('060301', '0603', 'Celendín', 1),\n" +
                            "\t('060302', '0603', 'Chumuch', 1),\n" +
                            "\t('060303', '0603', 'Cortegana', 1),\n" +
                            "\t('060304', '0603', 'Huasmin', 1),\n" +
                            "\t('060305', '0603', 'Jorge Chávez', 1),\n" +
                            "\t('060306', '0603', 'José Gálvez', 1),\n" +
                            "\t('060307', '0603', 'Miguel Iglesias', 1),\n" +
                            "\t('060308', '0603', 'Oxamarca', 1),\n" +
                            "\t('060309', '0603', 'Sorochuco', 1),\n" +
                            "\t('060310', '0603', 'Sucre', 1),\n" +
                            "\t('060311', '0603', 'Utco', 1),\n" +
                            "\t('060312', '0603', 'La Libertad de Pallan', 1),\n" +
                            "\t('060401', '0604', 'Chota', 1),\n" +
                            "\t('060402', '0604', 'Anguia', 1),\n" +
                            "\t('060403', '0604', 'Chadin', 1),\n" +
                            "\t('060404', '0604', 'Chiguirip', 1),\n" +
                            "\t('060405', '0604', 'Chimban', 1),\n" +
                            "\t('060406', '0604', 'Choropampa', 1),\n" +
                            "\t('060407', '0604', 'Cochabamba', 1),\n" +
                            "\t('060408', '0604', 'Conchan', 1),\n" +
                            "\t('060409', '0604', 'Huambos', 1),\n" +
                            "\t('060410', '0604', 'Lajas', 1),\n" +
                            "\t('060411', '0604', 'Llama', 1),\n" +
                            "\t('060412', '0604', 'Miracosta', 1),\n" +
                            "\t('060413', '0604', 'Paccha', 1),\n" +
                            "\t('060414', '0604', 'Pion', 1),\n" +
                            "\t('060415', '0604', 'Querocoto', 1),\n" +
                            "\t('060416', '0604', 'San Juan de Licupis', 1),\n" +
                            "\t('060417', '0604', 'Tacabamba', 1),\n" +
                            "\t('060418', '0604', 'Tocmoche', 1),\n" +
                            "\t('060419', '0604', 'Chalamarca', 1),\n" +
                            "\t('060501', '0605', 'Contumaza', 1),\n" +
                            "\t('060502', '0605', 'Chilete', 1),\n" +
                            "\t('060503', '0605', 'Cupisnique', 1),\n" +
                            "\t('060504', '0605', 'Guzmango', 1),\n" +
                            "\t('060505', '0605', 'San Benito', 1),\n" +
                            "\t('060506', '0605', 'Santa Cruz de Toledo', 1),\n" +
                            "\t('060507', '0605', 'Tantarica', 1),\n" +
                            "\t('060508', '0605', 'Yonan', 1),\n" +
                            "\t('060601', '0606', 'Cutervo', 1),\n" +
                            "\t('060602', '0606', 'Callayuc', 1),\n" +
                            "\t('060603', '0606', 'Choros', 1),\n" +
                            "\t('060604', '0606', 'Cujillo', 1),\n" +
                            "\t('060605', '0606', 'La Ramada', 1),\n" +
                            "\t('060606', '0606', 'Pimpingos', 1),\n" +
                            "\t('060607', '0606', 'Querocotillo', 1),\n" +
                            "\t('060608', '0606', 'San Andrés de Cutervo', 1),\n" +
                            "\t('060609', '0606', 'San Juan de Cutervo', 1),\n" +
                            "\t('060610', '0606', 'San Luis de Lucma', 1),\n" +
                            "\t('060611', '0606', 'Santa Cruz', 1),\n" +
                            "\t('060612', '0606', 'Santo Domingo de la Capilla', 1),\n" +
                            "\t('060613', '0606', 'Santo Tomas', 1),\n" +
                            "\t('060614', '0606', 'Socota', 1),\n" +
                            "\t('060615', '0606', 'Toribio Casanova', 1),\n" +
                            "\t('060701', '0607', 'Bambamarca', 1),\n" +
                            "\t('060702', '0607', 'Chugur', 1),\n" +
                            "\t('060703', '0607', 'Hualgayoc', 1),\n" +
                            "\t('060801', '0608', 'Jaén', 1),\n" +
                            "\t('060802', '0608', 'Bellavista', 1),\n" +
                            "\t('060803', '0608', 'Chontali', 1),\n" +
                            "\t('060804', '0608', 'Colasay', 1),\n" +
                            "\t('060805', '0608', 'Huabal', 1),\n" +
                            "\t('060806', '0608', 'Las Pirias', 1),\n" +
                            "\t('060807', '0608', 'Pomahuaca', 1),\n" +
                            "\t('060808', '0608', 'Pucara', 1),\n" +
                            "\t('060809', '0608', 'Sallique', 1),\n" +
                            "\t('060810', '0608', 'San Felipe', 1),\n" +
                            "\t('060811', '0608', 'San José del Alto', 1),\n" +
                            "\t('060812', '0608', 'Santa Rosa', 1),\n" +
                            "\t('060901', '0609', 'San Ignacio', 1),\n" +
                            "\t('060902', '0609', 'Chirinos', 1),\n" +
                            "\t('060903', '0609', 'Huarango', 1),\n" +
                            "\t('060904', '0609', 'La Coipa', 1),\n" +
                            "\t('060905', '0609', 'Namballe', 1),\n" +
                            "\t('060906', '0609', 'San José de Lourdes', 1),\n" +
                            "\t('060907', '0609', 'Tabaconas', 1),\n" +
                            "\t('061001', '0610', 'Pedro Gálvez', 1),\n" +
                            "\t('061002', '0610', 'Chancay', 1),\n" +
                            "\t('061003', '0610', 'Eduardo Villanueva', 1),\n" +
                            "\t('061004', '0610', 'Gregorio Pita', 1),\n" +
                            "\t('061005', '0610', 'Ichocan', 1),\n" +
                            "\t('061006', '0610', 'José Manuel Quiroz', 1),\n" +
                            "\t('061007', '0610', 'José Sabogal', 1),\n" +
                            "\t('061101', '0611', 'San Miguel', 1),\n" +
                            "\t('061102', '0611', 'Bolívar', 1),\n" +
                            "\t('061103', '0611', 'Calquis', 1),\n" +
                            "\t('061104', '0611', 'Catilluc', 1),\n" +
                            "\t('061105', '0611', 'El Prado', 1),\n" +
                            "\t('061106', '0611', 'La Florida', 1),\n" +
                            "\t('061107', '0611', 'Llapa', 1),\n" +
                            "\t('061108', '0611', 'Nanchoc', 1),\n" +
                            "\t('061109', '0611', 'Niepos', 1),\n" +
                            "\t('061110', '0611', 'San Gregorio', 1),\n" +
                            "\t('061111', '0611', 'San Silvestre de Cochan', 1),\n" +
                            "\t('061112', '0611', 'Tongod', 1),\n" +
                            "\t('061113', '0611', 'Unión Agua Blanca', 1),\n" +
                            "\t('061201', '0612', 'San Pablo', 1),\n" +
                            "\t('061202', '0612', 'San Bernardino', 1),\n" +
                            "\t('061203', '0612', 'San Luis', 1),\n" +
                            "\t('061204', '0612', 'Tumbaden', 1),\n" +
                            "\t('061301', '0613', 'Santa Cruz', 1),\n" +
                            "\t('061302', '0613', 'Andabamba', 1),\n" +
                            "\t('061303', '0613', 'Catache', 1),\n" +
                            "\t('061304', '0613', 'Chancaybaños', 1),\n" +
                            "\t('061305', '0613', 'La Esperanza', 1),\n" +
                            "\t('061306', '0613', 'Ninabamba', 1),\n" +
                            "\t('061307', '0613', 'Pulan', 1),\n" +
                            "\t('061308', '0613', 'Saucepampa', 1),\n" +
                            "\t('061309', '0613', 'Sexi', 1),\n" +
                            "\t('061310', '0613', 'Uticyacu', 1),\n" +
                            "\t('061311', '0613', 'Yauyucan', 1),\n" +
                            "\t('070101', '0701', 'Callao', 1),\n" +
                            "\t('070102', '0701', 'Bellavista', 1),\n" +
                            "\t('070103', '0701', 'Carmen de la Legua Reynoso', 1),\n" +
                            "\t('070104', '0701', 'La Perla', 1),\n" +
                            "\t('070105', '0701', 'La Punta', 1),\n" +
                            "\t('070106', '0701', 'Ventanilla', 1),\n" +
                            "\t('070107', '0701', 'Mi Perú', 1),\n" +
                            "\t('080101', '0801', 'Cusco', 1),\n" +
                            "\t('080102', '0801', 'Ccorca', 1),\n" +
                            "\t('080103', '0801', 'Poroy', 1),\n" +
                            "\t('080104', '0801', 'San Jerónimo', 1),\n" +
                            "\t('080105', '0801', 'San Sebastian', 1),\n" +
                            "\t('080106', '0801', 'Santiago', 1),\n" +
                            "\t('080107', '0801', 'Saylla', 1),\n" +
                            "\t('080108', '0801', 'Wanchaq', 1),\n" +
                            "\t('080201', '0802', 'Acomayo', 1),\n" +
                            "\t('080202', '0802', 'Acopia', 1),\n" +
                            "\t('080203', '0802', 'Acos', 1),\n" +
                            "\t('080204', '0802', 'Mosoc Llacta', 1),\n" +
                            "\t('080205', '0802', 'Pomacanchi', 1),\n" +
                            "\t('080206', '0802', 'Rondocan', 1),\n" +
                            "\t('080207', '0802', 'Sangarara', 1),\n" +
                            "\t('080301', '0803', 'Anta', 1),\n" +
                            "\t('080302', '0803', 'Ancahuasi', 1),\n" +
                            "\t('080303', '0803', 'Cachimayo', 1),\n" +
                            "\t('080304', '0803', 'Chinchaypujio', 1),\n" +
                            "\t('080305', '0803', 'Huarocondo', 1),\n" +
                            "\t('080306', '0803', 'Limatambo', 1),\n" +
                            "\t('080307', '0803', 'Mollepata', 1),\n" +
                            "\t('080308', '0803', 'Pucyura', 1),\n" +
                            "\t('080309', '0803', 'Zurite', 1),\n" +
                            "\t('080401', '0804', 'Calca', 1),\n" +
                            "\t('080402', '0804', 'Coya', 1),\n" +
                            "\t('080403', '0804', 'Lamay', 1),\n" +
                            "\t('080404', '0804', 'Lares', 1),\n" +
                            "\t('080405', '0804', 'Pisac', 1),\n" +
                            "\t('080406', '0804', 'San Salvador', 1),\n" +
                            "\t('080407', '0804', 'Taray', 1),\n" +
                            "\t('080408', '0804', 'Yanatile', 1),\n" +
                            "\t('080501', '0805', 'Yanaoca', 1),\n" +
                            "\t('080502', '0805', 'Checca', 1),\n" +
                            "\t('080503', '0805', 'Kunturkanki', 1),\n" +
                            "\t('080504', '0805', 'Langui', 1),\n" +
                            "\t('080505', '0805', 'Layo', 1),\n" +
                            "\t('080506', '0805', 'Pampamarca', 1),\n" +
                            "\t('080507', '0805', 'Quehue', 1),\n" +
                            "\t('080508', '0805', 'Tupac Amaru', 1),\n" +
                            "\t('080601', '0806', 'Sicuani', 1),\n" +
                            "\t('080602', '0806', 'Checacupe', 1),\n" +
                            "\t('080603', '0806', 'Combapata', 1),\n" +
                            "\t('080604', '0806', 'Marangani', 1),\n" +
                            "\t('080605', '0806', 'Pitumarca', 1),\n" +
                            "\t('080606', '0806', 'San Pablo', 1),\n" +
                            "\t('080607', '0806', 'San Pedro', 1),\n" +
                            "\t('080608', '0806', 'Tinta', 1),\n" +
                            "\t('080701', '0807', 'Santo Tomas', 1),\n" +
                            "\t('080702', '0807', 'Capacmarca', 1),\n" +
                            "\t('080703', '0807', 'Chamaca', 1),\n" +
                            "\t('080704', '0807', 'Colquemarca', 1),\n" +
                            "\t('080705', '0807', 'Livitaca', 1),\n" +
                            "\t('080706', '0807', 'Llusco', 1),\n" +
                            "\t('080707', '0807', 'Quiñota', 1),\n" +
                            "\t('080708', '0807', 'Velille', 1),\n" +
                            "\t('080801', '0808', 'Espinar', 1),\n" +
                            "\t('080802', '0808', 'Condoroma', 1),\n" +
                            "\t('080803', '0808', 'Coporaque', 1),\n" +
                            "\t('080804', '0808', 'Ocoruro', 1),\n" +
                            "\t('080805', '0808', 'Pallpata', 1),\n" +
                            "\t('080806', '0808', 'Pichigua', 1),\n" +
                            "\t('080807', '0808', 'Suyckutambo', 1),\n" +
                            "\t('080808', '0808', 'Alto Pichigua', 1),\n" +
                            "\t('080901', '0809', 'Santa Ana', 1),\n" +
                            "\t('080902', '0809', 'Echarate', 1),\n" +
                            "\t('080903', '0809', 'Huayopata', 1),\n" +
                            "\t('080904', '0809', 'Maranura', 1),\n" +
                            "\t('080905', '0809', 'Ocobamba', 1),\n" +
                            "\t('080906', '0809', 'Quellouno', 1),\n" +
                            "\t('080907', '0809', 'Kimbiri', 1),\n" +
                            "\t('080908', '0809', 'Santa Teresa', 1),\n" +
                            "\t('080909', '0809', 'Vilcabamba', 1),\n" +
                            "\t('080910', '0809', 'Pichari', 1),\n" +
                            "\t('080911', '0809', 'Inkawasi', 1),\n" +
                            "\t('080912', '0809', 'Villa Virgen', 1),\n" +
                            "\t('080913', '0809', 'Villa Kintiarina', 1),\n" +
                            "\t('081001', '0810', 'Paruro', 1),\n" +
                            "\t('081002', '0810', 'Accha', 1),\n" +
                            "\t('081003', '0810', 'Ccapi', 1),\n" +
                            "\t('081004', '0810', 'Colcha', 1),\n" +
                            "\t('081005', '0810', 'Huanoquite', 1),\n" +
                            "\t('081006', '0810', 'Omacha', 1),\n" +
                            "\t('081007', '0810', 'Paccaritambo', 1),\n" +
                            "\t('081008', '0810', 'Pillpinto', 1),\n" +
                            "\t('081009', '0810', 'Yaurisque', 1),\n" +
                            "\t('081101', '0811', 'Paucartambo', 1),\n" +
                            "\t('081102', '0811', 'Caicay', 1),\n" +
                            "\t('081103', '0811', 'Challabamba', 1),\n" +
                            "\t('081104', '0811', 'Colquepata', 1),\n" +
                            "\t('081105', '0811', 'Huancarani', 1),\n" +
                            "\t('081106', '0811', 'Kosñipata', 1),\n" +
                            "\t('081201', '0812', 'Urcos', 1),\n" +
                            "\t('081202', '0812', 'Andahuaylillas', 1),\n" +
                            "\t('081203', '0812', 'Camanti', 1),\n" +
                            "\t('081204', '0812', 'Ccarhuayo', 1),\n" +
                            "\t('081205', '0812', 'Ccatca', 1),\n" +
                            "\t('081206', '0812', 'Cusipata', 1),\n" +
                            "\t('081207', '0812', 'Huaro', 1),\n" +
                            "\t('081208', '0812', 'Lucre', 1),\n" +
                            "\t('081209', '0812', 'Marcapata', 1),\n" +
                            "\t('081210', '0812', 'Ocongate', 1),\n" +
                            "\t('081211', '0812', 'Oropesa', 1),\n" +
                            "\t('081212', '0812', 'Quiquijana', 1),\n" +
                            "\t('081301', '0813', 'Urubamba', 1),\n" +
                            "\t('081302', '0813', 'Chinchero', 1),\n" +
                            "\t('081303', '0813', 'Huayllabamba', 1),\n" +
                            "\t('081304', '0813', 'Machupicchu', 1),\n" +
                            "\t('081305', '0813', 'Maras', 1),\n" +
                            "\t('081306', '0813', 'Ollantaytambo', 1),\n" +
                            "\t('081307', '0813', 'Yucay', 1),\n" +
                            "\t('090101', '0901', 'Huancavelica', 1),\n" +
                            "\t('090102', '0901', 'Acobambilla', 1),\n" +
                            "\t('090103', '0901', 'Acoria', 1),\n" +
                            "\t('090104', '0901', 'Conayca', 1),\n" +
                            "\t('090105', '0901', 'Cuenca', 1),\n" +
                            "\t('090106', '0901', 'Huachocolpa', 1),\n" +
                            "\t('090107', '0901', 'Huayllahuara', 1),\n" +
                            "\t('090108', '0901', 'Izcuchaca', 1),\n" +
                            "\t('090109', '0901', 'Laria', 1),\n" +
                            "\t('090110', '0901', 'Manta', 1),\n" +
                            "\t('090111', '0901', 'Mariscal Cáceres', 1),\n" +
                            "\t('090112', '0901', 'Moya', 1),\n" +
                            "\t('090113', '0901', 'Nuevo Occoro', 1),\n" +
                            "\t('090114', '0901', 'Palca', 1),\n" +
                            "\t('090115', '0901', 'Pilchaca', 1),\n" +
                            "\t('090116', '0901', 'Vilca', 1),\n" +
                            "\t('090117', '0901', 'Yauli', 1),\n" +
                            "\t('090118', '0901', 'Ascensión', 1),\n" +
                            "\t('090119', '0901', 'Huando', 1),\n" +
                            "\t('090201', '0902', 'Acobamba', 1),\n" +
                            "\t('090202', '0902', 'Andabamba', 1),\n" +
                            "\t('090203', '0902', 'Anta', 1),\n" +
                            "\t('090204', '0902', 'Caja', 1),\n" +
                            "\t('090205', '0902', 'Marcas', 1),\n" +
                            "\t('090206', '0902', 'Paucara', 1),\n" +
                            "\t('090207', '0902', 'Pomacocha', 1),\n" +
                            "\t('090208', '0902', 'Rosario', 1),\n" +
                            "\t('090301', '0903', 'Lircay', 1),\n" +
                            "\t('090302', '0903', 'Anchonga', 1),\n" +
                            "\t('090303', '0903', 'Callanmarca', 1),\n" +
                            "\t('090304', '0903', 'Ccochaccasa', 1),\n" +
                            "\t('090305', '0903', 'Chincho', 1),\n" +
                            "\t('090306', '0903', 'Congalla', 1),\n" +
                            "\t('090307', '0903', 'Huanca-Huanca', 1),\n" +
                            "\t('090308', '0903', 'Huayllay Grande', 1),\n" +
                            "\t('090309', '0903', 'Julcamarca', 1),\n" +
                            "\t('090310', '0903', 'San Antonio de Antaparco', 1),\n" +
                            "\t('090311', '0903', 'Santo Tomas de Pata', 1),\n" +
                            "\t('090312', '0903', 'Secclla', 1),\n" +
                            "\t('090401', '0904', 'Castrovirreyna', 1),\n" +
                            "\t('090402', '0904', 'Arma', 1),\n" +
                            "\t('090403', '0904', 'Aurahua', 1),\n" +
                            "\t('090404', '0904', 'Capillas', 1),\n" +
                            "\t('090405', '0904', 'Chupamarca', 1),\n" +
                            "\t('090406', '0904', 'Cocas', 1),\n" +
                            "\t('090407', '0904', 'Huachos', 1),\n" +
                            "\t('090408', '0904', 'Huamatambo', 1),\n" +
                            "\t('090409', '0904', 'Mollepampa', 1),\n" +
                            "\t('090410', '0904', 'San Juan', 1),\n" +
                            "\t('090411', '0904', 'Santa Ana', 1),\n" +
                            "\t('090412', '0904', 'Tantara', 1),\n" +
                            "\t('090413', '0904', 'Ticrapo', 1),\n" +
                            "\t('090501', '0905', 'Churcampa', 1),\n" +
                            "\t('090502', '0905', 'Anco', 1),\n" +
                            "\t('090503', '0905', 'Chinchihuasi', 1),\n" +
                            "\t('090504', '0905', 'El Carmen', 1),\n" +
                            "\t('090505', '0905', 'La Merced', 1),\n" +
                            "\t('090506', '0905', 'Locroja', 1),\n" +
                            "\t('090507', '0905', 'Paucarbamba', 1),\n" +
                            "\t('090508', '0905', 'San Miguel de Mayocc', 1),\n" +
                            "\t('090509', '0905', 'San Pedro de Coris', 1),\n" +
                            "\t('090510', '0905', 'Pachamarca', 1),\n" +
                            "\t('090511', '0905', 'Cosme', 1),\n" +
                            "\t('090601', '0906', 'Huaytara', 1),\n" +
                            "\t('090602', '0906', 'Ayavi', 1),\n" +
                            "\t('090603', '0906', 'Córdova', 1),\n" +
                            "\t('090604', '0906', 'Huayacundo Arma', 1),\n" +
                            "\t('090605', '0906', 'Laramarca', 1),\n" +
                            "\t('090606', '0906', 'Ocoyo', 1),\n" +
                            "\t('090607', '0906', 'Pilpichaca', 1),\n" +
                            "\t('090608', '0906', 'Querco', 1),\n" +
                            "\t('090609', '0906', 'Quito-Arma', 1),\n" +
                            "\t('090610', '0906', 'San Antonio de Cusicancha', 1),\n" +
                            "\t('090611', '0906', 'San Francisco de Sangayaico', 1),\n" +
                            "\t('090612', '0906', 'San Isidro', 1),\n" +
                            "\t('090613', '0906', 'Santiago de Chocorvos', 1),\n" +
                            "\t('090614', '0906', 'Santiago de Quirahuara', 1),\n" +
                            "\t('090615', '0906', 'Santo Domingo de Capillas', 1),\n" +
                            "\t('090616', '0906', 'Tambo', 1),\n" +
                            "\t('090701', '0907', 'Pampas', 1),\n" +
                            "\t('090702', '0907', 'Acostambo', 1),\n" +
                            "\t('090703', '0907', 'Acraquia', 1),\n" +
                            "\t('090704', '0907', 'Ahuaycha', 1),\n" +
                            "\t('090705', '0907', 'Colcabamba', 1),\n" +
                            "\t('090706', '0907', 'Daniel Hernández', 1),\n" +
                            "\t('090707', '0907', 'Huachocolpa', 1),\n" +
                            "\t('090709', '0907', 'Huaribamba', 1),\n" +
                            "\t('090710', '0907', 'Ñahuimpuquio', 1),\n" +
                            "\t('090711', '0907', 'Pazos', 1),\n" +
                            "\t('090713', '0907', 'Quishuar', 1),\n" +
                            "\t('090714', '0907', 'Salcabamba', 1),\n" +
                            "\t('090715', '0907', 'Salcahuasi', 1),\n" +
                            "\t('090716', '0907', 'San Marcos de Rocchac', 1),\n" +
                            "\t('090717', '0907', 'Surcubamba', 1),\n" +
                            "\t('090718', '0907', 'Tintay Puncu', 1),\n" +
                            "\t('090719', '0907', 'Quichuas', 1),\n" +
                            "\t('090720', '0907', 'Andaymarca', 1),\n" +
                            "\t('090721', '0907', 'Roble', 1),\n" +
                            "\t('090722', '0907', 'Pichos', 1),\n" +
                            "\t('100101', '1001', 'Huanuco', 1),\n" +
                            "\t('100102', '1001', 'Amarilis', 1),\n" +
                            "\t('100103', '1001', 'Chinchao', 1),\n" +
                            "\t('100104', '1001', 'Churubamba', 1),\n" +
                            "\t('100105', '1001', 'Margos', 1),\n" +
                            "\t('100106', '1001', 'Quisqui (Kichki)', 1),\n" +
                            "\t('100107', '1001', 'San Francisco de Cayran', 1),\n" +
                            "\t('100108', '1001', 'San Pedro de Chaulan', 1),\n" +
                            "\t('100109', '1001', 'Santa María del Valle', 1),\n" +
                            "\t('100110', '1001', 'Yarumayo', 1),\n" +
                            "\t('100111', '1001', 'Pillco Marca', 1),\n" +
                            "\t('100112', '1001', 'Yacus', 1),\n" +
                            "\t('100113', '1001', 'San Pablo de Pillao', 1),\n" +
                            "\t('100201', '1002', 'Ambo', 1),\n" +
                            "\t('100202', '1002', 'Cayna', 1),\n" +
                            "\t('100203', '1002', 'Colpas', 1),\n" +
                            "\t('100204', '1002', 'Conchamarca', 1),\n" +
                            "\t('100205', '1002', 'Huacar', 1),\n" +
                            "\t('100206', '1002', 'San Francisco', 1),\n" +
                            "\t('100207', '1002', 'San Rafael', 1),\n" +
                            "\t('100208', '1002', 'Tomay Kichwa', 1),\n" +
                            "\t('100301', '1003', 'La Unión', 1),\n" +
                            "\t('100307', '1003', 'Chuquis', 1),\n" +
                            "\t('100311', '1003', 'Marías', 1),\n" +
                            "\t('100313', '1003', 'Pachas', 1),\n" +
                            "\t('100316', '1003', 'Quivilla', 1),\n" +
                            "\t('100317', '1003', 'Ripan', 1),\n" +
                            "\t('100321', '1003', 'Shunqui', 1),\n" +
                            "\t('100322', '1003', 'Sillapata', 1),\n" +
                            "\t('100323', '1003', 'Yanas', 1),\n" +
                            "\t('100401', '1004', 'Huacaybamba', 1),\n" +
                            "\t('100402', '1004', 'Canchabamba', 1),\n" +
                            "\t('100403', '1004', 'Cochabamba', 1),\n" +
                            "\t('100404', '1004', 'Pinra', 1),\n" +
                            "\t('100501', '1005', 'Llata', 1),\n" +
                            "\t('100502', '1005', 'Arancay', 1),\n" +
                            "\t('100503', '1005', 'Chavín de Pariarca', 1),\n" +
                            "\t('100504', '1005', 'Jacas Grande', 1),\n" +
                            "\t('100505', '1005', 'Jircan', 1),\n" +
                            "\t('100506', '1005', 'Miraflores', 1),\n" +
                            "\t('100507', '1005', 'Monzón', 1),\n" +
                            "\t('100508', '1005', 'Punchao', 1),\n" +
                            "\t('100509', '1005', 'Puños', 1),\n" +
                            "\t('100510', '1005', 'Singa', 1),\n" +
                            "\t('100511', '1005', 'Tantamayo', 1),\n" +
                            "\t('100601', '1006', 'Rupa-Rupa', 1),\n" +
                            "\t('100602', '1006', 'Daniel Alomía Robles', 1),\n" +
                            "\t('100603', '1006', 'Hermílio Valdizan', 1),\n" +
                            "\t('100604', '1006', 'José Crespo y Castillo', 1),\n" +
                            "\t('100605', '1006', 'Luyando', 1),\n" +
                            "\t('100606', '1006', 'Mariano Damaso Beraun', 1),\n" +
                            "\t('100607', '1006', 'Pucayacu', 1),\n" +
                            "\t('100608', '1006', 'Castillo Grande', 1),\n" +
                            "\t('100701', '1007', 'Huacrachuco', 1),\n" +
                            "\t('100702', '1007', 'Cholon', 1),\n" +
                            "\t('100703', '1007', 'San Buenaventura', 1),\n" +
                            "\t('100704', '1007', 'La Morada', 1),\n" +
                            "\t('100705', '1007', 'Santa Rosa de Alto Yanajanca', 1),\n" +
                            "\t('100801', '1008', 'Panao', 1),\n" +
                            "\t('100802', '1008', 'Chaglla', 1),\n" +
                            "\t('100803', '1008', 'Molino', 1),\n" +
                            "\t('100804', '1008', 'Umari', 1),\n" +
                            "\t('100901', '1009', 'Puerto Inca', 1),\n" +
                            "\t('100902', '1009', 'Codo del Pozuzo', 1),\n" +
                            "\t('100903', '1009', 'Honoria', 1),\n" +
                            "\t('100904', '1009', 'Tournavista', 1),\n" +
                            "\t('100905', '1009', 'Yuyapichis', 1),\n" +
                            "\t('101001', '1010', 'Jesús', 1),\n" +
                            "\t('101002', '1010', 'Baños', 1),\n" +
                            "\t('101003', '1010', 'Jivia', 1),\n" +
                            "\t('101004', '1010', 'Queropalca', 1),\n" +
                            "\t('101005', '1010', 'Rondos', 1),\n" +
                            "\t('101006', '1010', 'San Francisco de Asís', 1),\n" +
                            "\t('101007', '1010', 'San Miguel de Cauri', 1),\n" +
                            "\t('101101', '1011', 'Chavinillo', 1),\n" +
                            "\t('101102', '1011', 'Cahuac', 1),\n" +
                            "\t('101103', '1011', 'Chacabamba', 1),\n" +
                            "\t('101104', '1011', 'Aparicio Pomares', 1),\n" +
                            "\t('101105', '1011', 'Jacas Chico', 1),\n" +
                            "\t('101106', '1011', 'Obas', 1),\n" +
                            "\t('101107', '1011', 'Pampamarca', 1),\n" +
                            "\t('101108', '1011', 'Choras', 1),\n" +
                            "\t('110101', '1101', 'Ica', 1),\n" +
                            "\t('110102', '1101', 'La Tinguiña', 1),\n" +
                            "\t('110103', '1101', 'Los Aquijes', 1),\n" +
                            "\t('110104', '1101', 'Ocucaje', 1),\n" +
                            "\t('110105', '1101', 'Pachacutec', 1),\n" +
                            "\t('110106', '1101', 'Parcona', 1),\n" +
                            "\t('110107', '1101', 'Pueblo Nuevo', 1),\n" +
                            "\t('110108', '1101', 'Salas', 1),\n" +
                            "\t('110109', '1101', 'San José de Los Molinos', 1),\n" +
                            "\t('110110', '1101', 'San Juan Bautista', 1),\n" +
                            "\t('110111', '1101', 'Santiago', 1),\n" +
                            "\t('110112', '1101', 'Subtanjalla', 1),\n" +
                            "\t('110113', '1101', 'Tate', 1),\n" +
                            "\t('110114', '1101', 'Yauca del Rosario', 1),\n" +
                            "\t('110201', '1102', 'Chincha Alta', 1),\n" +
                            "\t('110202', '1102', 'Alto Laran', 1),\n" +
                            "\t('110203', '1102', 'Chavin', 1),\n" +
                            "\t('110204', '1102', 'Chincha Baja', 1),\n" +
                            "\t('110205', '1102', 'El Carmen', 1),\n" +
                            "\t('110206', '1102', 'Grocio Prado', 1),\n" +
                            "\t('110207', '1102', 'Pueblo Nuevo', 1),\n" +
                            "\t('110208', '1102', 'San Juan de Yanac', 1),\n" +
                            "\t('110209', '1102', 'San Pedro de Huacarpana', 1),\n" +
                            "\t('110210', '1102', 'Sunampe', 1),\n" +
                            "\t('110211', '1102', 'Tambo de Mora', 1),\n" +
                            "\t('110301', '1103', 'Nasca', 1),\n" +
                            "\t('110302', '1103', 'Changuillo', 1),\n" +
                            "\t('110303', '1103', 'El Ingenio', 1),\n" +
                            "\t('110304', '1103', 'Marcona', 1),\n" +
                            "\t('110305', '1103', 'Vista Alegre', 1),\n" +
                            "\t('110401', '1104', 'Palpa', 1),\n" +
                            "\t('110402', '1104', 'Llipata', 1),\n" +
                            "\t('110403', '1104', 'Río Grande', 1),\n" +
                            "\t('110404', '1104', 'Santa Cruz', 1),\n" +
                            "\t('110405', '1104', 'Tibillo', 1),\n" +
                            "\t('110501', '1105', 'Pisco', 1),\n" +
                            "\t('110502', '1105', 'Huancano', 1),\n" +
                            "\t('110503', '1105', 'Humay', 1),\n" +
                            "\t('110504', '1105', 'Independencia', 1),\n" +
                            "\t('110505', '1105', 'Paracas', 1),\n" +
                            "\t('110506', '1105', 'San Andrés', 1),\n" +
                            "\t('110507', '1105', 'San Clemente', 1),\n" +
                            "\t('110508', '1105', 'Tupac Amaru Inca', 1);"

            };
    //crera tabla cliente
    public static String tablaCliente = "" +
            " create table cliente (" +
            " dni char(8) primary key, " +
            " nombre varchar(30) not null, " +
            " telefono varchar(15) null, " +
            " codigo_departamento char(2) not null, " +
            " codigo_provincia char(2) not null, " +
            " codigo_distrito char(2) not null, " +
            " latitud real, " +
            " longitud real, " +
            " direccion varchar(70), " +
            " foto blob, " +
            " correo_electronico varchar(30)," +
            " foreign key (codigo_departamento, codigo_provincia, codigo_distrito) " +
            " references distrito(codigo_departamento, codigo_provincia, codigo_distrito))";

    //Datos prueba
    public static String[] tablaClienteDatos = {
            "insert into cliente " +
            " values('71068282', 'josue Delgado', '12345678', '13','01','01', " +
            " -6.7606098, -79.8632581, 'Av San Josemaría Escriva de Balaguer 855 Chiclayo 14012',null, 'josue@usat.edu.pe')"
            ,
            "insert into cliente " +
            " values('71068243', 'Huilder Mera', '12345678', '13','01','01', " +
            " -6.7606098, -79.8632581, 'Av Libertad 540 Chiclayo 14012',null, 'hmera@usat.edu.pe')"
    };
    public static String tablaSerieComprobante =
            "create table serie_comprobante (codigo_tipo_comprobante char(2),serie int, numero int);";

    public static String serieComprobante[] = {
            "insert into serie_comprobante values('01','B001',0);",
            "insert into serie_comprobante values('01','B002',0);",
            "insert into serie_comprobante values('01','B003',0);",
            "insert into serie_comprobante values('01','B004',0);",
            "insert into serie_comprobante values('01','B005',0);",
            "insert into serie_comprobante values('01','B006',0);",
            "insert into serie_comprobante values('03','F001',0);",
            "insert into serie_comprobante values('03','F002',0);",
            "insert into serie_comprobante values('03','F003',0);",
            "insert into serie_comprobante values('03','F004',0);",
            "insert into serie_comprobante values('03','F005',0);",
            "insert into serie_comprobante values('03','F006',0);",
    };
}
