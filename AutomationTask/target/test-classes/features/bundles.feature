Feature: Bundles


  Scenario Outline: Validation on Lite bundle for KSA country
    Given User open bundles page
    When selecting a "<country>"
    Then Type of the bundle should be "<Type>" and price should be "<Price>" and currency should be "<Currency>"
    Examples:
      | Type | Price | Currency  | country |
      | LITE | 15    | SAR/month | KSA     |


  Scenario Outline: Validation on classic bundle for KSA country
    Given User open bundles page
    When selecting a "<country>"
    Then Type of the bundle should be "<Type>" and price should be "<Price>" and currency should be "<Currency>"
    Examples:
      | Type    | Price | Currency  | country |
      | CLASSIC | 25    | SAR/month | KSA     |

  Scenario Outline: Validation on premium bundle for KSA country
    Given User open bundles page
    When selecting a "<country>"
    Then Type of the bundle should be "<Type>" and price should be "<Price>" and currency should be "<Currency>"
    Examples:
      | Type    | Price | Currency  | country |
      | PREMIUM | 60    | SAR/month | KSA     |

  Scenario Outline: Validation on Lite bundle for Bahrain country
    Given User open bundles page
    When selecting a "<country>"
    Then Type of the bundle should be "<Type>" and price should be "<Price>" and currency should be "<Currency>"
    Examples:
      | Type | Price | Currency  | country |
      | LITE | 2     | BHD/month | Bahrain |

  Scenario Outline: Validation on classic bundle for Bahrain country
    Given User open bundles page
    When selecting a "<country>"
    Then Type of the bundle should be "<Type>" and price should be "<Price>" and currency should be "<Currency>"
    Examples:
      | Type    | Price | Currency  | country |
      | CLASSIC | 3     | BHD/month | Bahrain |


  Scenario Outline: Validation on premium bundle for Bahrain country
    Given User open bundles page
    When selecting a "<country>"
    Then Type of the bundle should be "<Type>" and price should be "<Price>" and currency should be "<Currency>"
    Examples:
      | Type    | Price | Currency  | country |
      | PREMIUM | 6     | BHD/month | Bahrain |

  Scenario Outline: Validation on Lite bundle for kuwait country
    Given User open bundles page
    When selecting a "<country>"
    Then Type of the bundle should be "<Type>" and price should be "<Price>" and currency should be "<Currency>"
    Examples:
      | Type | Price | Currency  | country |
      | LITE | 1.2   | KWD/month | Kuwait  |

  Scenario Outline: Validation on classic bundle for kuwait country
    Given User open bundles page
    When selecting a "<country>"
    Then Type of the bundle should be "<Type>" and price should be "<Price>" and currency should be "<Currency>"
    Examples:
      | Type    | Price | Currency  | country |
      | CLASSIC | 2.5   | KWD/month | Kuwait  |

  Scenario Outline: Validation on premium bundle for kuwait country
    Given User open bundles page
    When selecting a "<country>"
    Then Type of the bundle should be "<Type>" and price should be "<Price>" and currency should be "<Currency>"
    Examples:
      | Type    | Price | Currency  | country |
      | PREMIUM | 4.8   | KWD/month | Kuwait  |