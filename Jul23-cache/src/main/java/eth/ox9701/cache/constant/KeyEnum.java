package eth.ox9701.cache.constant;

public enum KeyEnum {
    CONFIG("his_config_info"),
    SECRET("secretMac"),
    BALANCE("f5");

    private String typeName;

    KeyEnum(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 根据类型的名称，返回类型的枚举实例。
     *
     * @param typeName 类型名称
     */
    public static KeyEnum fromTypeName(String typeName) {
        for (KeyEnum type : KeyEnum.values()) {
            if (type.getTypeName().equals(typeName)) {
                return type;
            }
        }
        return null;
    }

    public String getTypeName() {
        return this.typeName;
    }

}
